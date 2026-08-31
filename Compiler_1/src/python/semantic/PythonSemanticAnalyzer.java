package python.semantic;

import python.ast.*;
import symboltable.*;

import java.util.ArrayList;
import java.util.List;

public class PythonSemanticAnalyzer {

    private SymbolTable symbolTable;
    private List<String> errors;
    private int loopDepth = 0;
    private int functionDepth = 0;

    /** Names that Python (and Flask) provide without a definition in the source file. */
    private static final String[] BUILTINS = {
        "print", "len", "str", "int", "float", "bool", "list", "dict", "set", "tuple", "range", "enumerate",
        "sorted", "reversed", "min", "max", "sum", "abs", "round", "isinstance", "type", "input", "open",
        "zip", "map", "filter", "any", "all", "id", "hash", "iter", "next", "super", "object", "Exception",
        "ValueError", "KeyError", "TypeError", "__name__", "True", "False", "None"
    };

    public PythonSemanticAnalyzer(SymbolTable st) {
        this.symbolTable = st;
        this.errors = new ArrayList<>();
        for (String b : BUILTINS) {
            if (symbolTable.resolve(b) == null) symbolTable.define(new Symbol(b, new SymbolTable.BuiltInTypeSymbol("builtin")));
        }
    }

    public List<String> getErrors() {
        return errors;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    private void reportError(int line, String message) {
        errors.add("Semantic Error at line " + line + ": " + message);
    }

    public void analyze(ASTNode root) {
        visit(root);
    }

    private void visit(ASTNode node) {
        if (node == null) return;

        if (node instanceof BlockNode) visitBlock((BlockNode) node);
        else if (node instanceof FunctionDefNode) visitFunctionDef((FunctionDefNode) node);
        else if (node instanceof ClassDefNode) visitClassDef((ClassDefNode) node);
        else if (node instanceof AssignmentNode) visitAssignment((AssignmentNode) node);
        else if (node instanceof IfNode) visitIf((IfNode) node);
        else if (node instanceof WhileNode) visitWhile((WhileNode) node);
        else if (node instanceof ForNode) visitFor((ForNode) node);
        else if (node instanceof BinaryOpNode) visitBinaryOp((BinaryOpNode) node);
        else if (node instanceof FunctionCallNode) visitFunctionCall((FunctionCallNode) node);
        else if (node instanceof ReturnNode) visitReturn((ReturnNode) node);
        else if (node instanceof IdentifierNode) visitIdentifier((IdentifierNode) node);
        else if (node instanceof AugmentedAssignNode) visitAugmentedAssign((AugmentedAssignNode) node);
        else if (node instanceof FromImportNode) visitFromImport((FromImportNode) node);
        else if (node instanceof ImportNode) visitImport((ImportNode) node);
        else if (node instanceof AttributeAccessNode) visit(((AttributeAccessNode) node).object);
        
        else {
            for (ASTNode child : node.getChildren()) {
                visit(child);
            }
        }
    }

    private void visitFromImport(FromImportNode node) {
        for (String alias : node.importedItems.values()) {
            symbolTable.define(new Symbol(alias, new SymbolTable.BuiltInTypeSymbol("import")));
        }
    }

    private void visitImport(ImportNode node) {
        for (String alias : node.modules.values()) {
            String top = alias.contains(".") ? alias.substring(0, alias.indexOf('.')) : alias;
            symbolTable.define(new Symbol(top, new SymbolTable.BuiltInTypeSymbol("module")));
        }
    }

    private void visitBlock(BlockNode node) {
        for (StatementNode stmt : node.statements) {
            visit(stmt);
        }
    }

    private void visitFunctionDef(FunctionDefNode node) {
        Symbol existing = symbolTable.resolve(node.name);
        if (existing != null && existing.scope == symbolTable.getCurrentScope()) {
            reportError(node.getLineNumber(), "Redeclaration of function '" + node.name + "' in the same scope.");
        }

        Type returnType = new SymbolTable.BuiltInTypeSymbol("dynamic");
        FunctionSymbol functionSymbol = new FunctionSymbol(node.name, returnType, symbolTable.getCurrentScope());
        symbolTable.define(functionSymbol);

        symbolTable.enterScope(functionSymbol);
        functionDepth++;

        for (String param : node.parameters) {
            VariableSymbol paramSym = new VariableSymbol(param, new SymbolTable.BuiltInTypeSymbol("dynamic"));
            symbolTable.define(paramSym);
        }

        visit(node.body);

        functionDepth--;
        symbolTable.exitScope();
    }

    private void visitClassDef(ClassDefNode node) {
        Symbol existing = symbolTable.resolve(node.className);
        if (existing != null && existing.scope == symbolTable.getCurrentScope()) {
            reportError(node.getLineNumber(), "Redeclaration of class '" + node.className + "'.");
        }
        symbolTable.define(new Symbol(node.className, new SymbolTable.BuiltInTypeSymbol("class")));

        LocalScope classScope = new LocalScope(symbolTable.getCurrentScope());
        symbolTable.enterScope(classScope);

        visit(node.body);

        symbolTable.exitScope();
    }

    private void visitAssignment(AssignmentNode node) {
        if (node.target instanceof IdentifierNode) {
            String varName = ((IdentifierNode) node.target).name;
            Symbol existing = symbolTable.resolve(varName);

            if (existing == null || existing.scope != symbolTable.getCurrentScope()) {
                VariableSymbol varSym = new VariableSymbol(varName, new SymbolTable.BuiltInTypeSymbol("dynamic"));
                symbolTable.define(varSym);
            }
        }
        visit(node.target);
        visit(node.value);
    }
    
    private void visitAugmentedAssign(AugmentedAssignNode node) {
        if (node.target instanceof IdentifierNode) {
            String varName = ((IdentifierNode) node.target).name;
            Symbol existing = symbolTable.resolve(varName);
            if (existing == null) {
                reportError(node.getLineNumber(), "Undefined variable '" + varName + "' used in augmented assignment.");
            }
        }
        visit(node.target);
        visit(node.value);
    }

    private void visitIf(IfNode node) {
        visit(node.condition);
        visit(node.thenBlock);
        if (node.elseBlock != null) visit(node.elseBlock);
    }

    private void visitWhile(WhileNode node) {
        visit(node.condition);
        loopDepth++;
        visit(node.body);
        loopDepth--;
    }

    private void visitFor(ForNode node) {
        if (node.target instanceof IdentifierNode) {
            String varName = ((IdentifierNode) node.target).name;
            symbolTable.define(new VariableSymbol(varName, new SymbolTable.BuiltInTypeSymbol("dynamic")));
        }
        visit(node.iterator);
        
        loopDepth++;
        visit(node.body);
        loopDepth--;
    }

    private void visitBinaryOp(BinaryOpNode node) {
        visit(node.left);
        visit(node.right);
        
        if (node.left instanceof LiteralNode && node.right instanceof LiteralNode) {
            LiteralNode leftLit = (LiteralNode) node.left;
            LiteralNode rightLit = (LiteralNode) node.right;
            if (!leftLit.type.equals(rightLit.type) && (!leftLit.type.equals("int") && !leftLit.type.equals("float"))) {
                if (node.operator.equals("+")) {
                    if ((leftLit.type.equals("string") && (rightLit.type.equals("int") || rightLit.type.equals("float"))) ||
                        (rightLit.type.equals("string") && (leftLit.type.equals("int") || leftLit.type.equals("float")))) {
                        reportError(node.getLineNumber(), "Type mismatch: cannot add " + leftLit.type + " and " + rightLit.type);
                    }
                }
            }
        }
    }

    private void visitFunctionCall(FunctionCallNode node) {
        if (!(node.functionName instanceof IdentifierNode)) visit(node.functionName);
        for (ExpressionNode arg : node.arguments) {
            visit(arg);
        }

        if (node.functionName instanceof IdentifierNode) {
            String funcName = ((IdentifierNode) node.functionName).name;
            Symbol sym = symbolTable.resolve(funcName);
            if (sym == null) {
                reportError(node.getLineNumber(), "Call to undefined function '" + funcName + "'.");
            } else if (sym instanceof FunctionSymbol) {
                // Not enforcing parameter counts since we don't store them yet
            }
        }
    }

    private void visitReturn(ReturnNode node) {
        if (functionDepth == 0) {
            reportError(node.getLineNumber(), "'return' outside function");
        }
        if (node.expression != null) {
            visit(node.expression);
        }
    }

    private void visitIdentifier(IdentifierNode node) {
        Symbol sym = symbolTable.resolve(node.name);
        if (sym == null) {
            reportError(node.getLineNumber(), "Undefined variable '" + node.name + "'");
        }
    }
}

