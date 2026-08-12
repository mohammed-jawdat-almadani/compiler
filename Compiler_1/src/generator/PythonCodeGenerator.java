package generator;

import python.ast.*;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.util.Map;

public class PythonCodeGenerator {
    private final StringWriter stringWriter = new StringWriter();
    private final PrintWriter emit = new PrintWriter(stringWriter);
    private int indentLevel = 0;

    private void indent() {
        for (int i = 0; i < indentLevel; i++) {
            emit.print("    ");
        }
    }

    private void emitLine(String text) {
        indent();
        emit.println(text);
    }

    public void generate(ASTNode pythonRoot) {
        if (pythonRoot == null) return;
        visit(pythonRoot);
    }

    public String getGeneratedCode() {
        return stringWriter.toString();
    }

    private void visit(ASTNode node) {
        if (node == null) return;

        if (node instanceof BlockNode) {
            for (StatementNode stmt : ((BlockNode) node).statements) {
                if (stmt instanceof ExpressionNode) {
                    indent();
                    visit(stmt);
                    emit.println();
                } else {
                    visit(stmt);
                }
            }
        } else if (node instanceof FromImportNode) {
            FromImportNode fromNode = (FromImportNode) node;
            emitLine("from " + fromNode.moduleName + " import " + String.join(", ", fromNode.importedItems.keySet()));
        } else if (node instanceof ImportNode) {
            ImportNode impNode = (ImportNode) node;
            emitLine("import " + String.join(", ", impNode.modules.keySet()));
        } else if (node instanceof FunctionDefNode) {
            FunctionDefNode fNode = (FunctionDefNode) node;
            if (fNode.decorators != null) {
                for (DecoratorNode dec : fNode.decorators) {
                    indent();
                    emit.print("@");
                    visit(dec.name);
                    emit.println();
                }
            }
            emitLine("def " + fNode.name + "(" + String.join(", ", fNode.parameters) + "):");
            indentLevel++;
            if (((BlockNode)fNode.body).statements.isEmpty()) {
                emitLine("pass");
            } else {
                visit(fNode.body);
            }
            indentLevel--;
            emit.println();
        } else if (node instanceof ClassDefNode) {
            ClassDefNode cNode = (ClassDefNode) node;
            emitLine("class " + cNode.className + ":");
            indentLevel++;
            visit(cNode.body);
            indentLevel--;
            emit.println();
        } else if (node instanceof AssignmentNode) {
            AssignmentNode aNode = (AssignmentNode) node;
            indent();
            visit(aNode.target);
            emit.print(" = ");
            visit(aNode.value);
            emit.println();
        } else if (node instanceof AugmentedAssignNode) {
            AugmentedAssignNode aNode = (AugmentedAssignNode) node;
            indent();
            visit(aNode.target);
            emit.print(" " + aNode.operator + "= ");
            visit(aNode.value);
            emit.println();
        } else if (node instanceof FunctionCallNode) {
            FunctionCallNode call = (FunctionCallNode) node;
            visit(call.functionName);
            emit.print("(");
            for (int i = 0; i < call.arguments.size(); i++) {
                if (call.arguments.get(i) instanceof KeywordArgumentNode) {
                    KeywordArgumentNode kw = (KeywordArgumentNode) call.arguments.get(i);
                    emit.print(kw.name + "=");
                    visit(kw.value);
                } else {
                    visit(call.arguments.get(i));
                }
                if (i < call.arguments.size() - 1) emit.print(", ");
            }
            emit.print(")");
        } else if (node instanceof ReturnNode) {
            ReturnNode ret = (ReturnNode) node;
            indent();
            emit.print("return ");
            if (ret.expression != null) {
                visit(ret.expression);
            }
            emit.println();
        } else if (node instanceof IfNode) {
            IfNode ifNode = (IfNode) node;
            indent();
            emit.print("if ");
            visit(ifNode.condition);
            emit.println(":");
            indentLevel++;
            visit(ifNode.thenBlock);
            indentLevel--;
            
            if (ifNode.elseBlock != null) {
                emitLine("else:");
                indentLevel++;
                visit(ifNode.elseBlock);
                indentLevel--;
            }
        } else if (node instanceof WhileNode) {
            WhileNode wNode = (WhileNode) node;
            indent();
            emit.print("while ");
            visit(wNode.condition);
            emit.println(":");
            indentLevel++;
            visit(wNode.body);
            indentLevel--;
        } else if (node instanceof ForNode) {
            ForNode fNode = (ForNode) node;
            indent();
            emit.print("for ");
            visit(fNode.target);
            emit.print(" in ");
            visit(fNode.iterator);
            emit.println(":");
            indentLevel++;
            visit(fNode.body);
            indentLevel--;
        } else if (node instanceof BinaryOpNode) {
            BinaryOpNode bNode = (BinaryOpNode) node;
            visit(bNode.left);
            emit.print(" " + bNode.operator + " ");
            visit(bNode.right);
        } else if (node instanceof IdentifierNode) {
            emit.print(((IdentifierNode) node).name);
        } else if (node instanceof LiteralNode) {
            LiteralNode lit = (LiteralNode) node;
            emit.print(lit.value);
        } else if (node instanceof AttributeAccessNode) {
            AttributeAccessNode attrNode = (AttributeAccessNode) node;
            visit(attrNode.object);
            emit.print("." + attrNode.attributeName);
        } else if (node instanceof SubscriptNode) {
            SubscriptNode subNode = (SubscriptNode) node;
            visit(subNode.container);
            emit.print("[");
            visit(subNode.index);
            emit.print("]");
        } else if (node instanceof ListNode) {
            ListNode listNode = (ListNode) node;
            emit.print("[");
            for (int i = 0; i < listNode.elements.size(); i++) {
                visit(listNode.elements.get(i));
                if (i < listNode.elements.size() - 1) emit.print(", ");
            }
            emit.print("]");
        } else if (node instanceof DictNode) {
            DictNode dictNode = (DictNode) node;
            emit.print("{");
            int i = 0;
            for (Map.Entry<ASTNode, ASTNode> entry : dictNode.entries.entrySet()) {
                visit(entry.getKey());
                emit.print(": ");
                visit(entry.getValue());
                if (i < dictNode.entries.size() - 1) emit.print(", ");
                i++;
            }
            emit.print("}");
        } else if (node instanceof ScopeDefNode) {
            ScopeDefNode scopeNode = (ScopeDefNode) node;
            if (scopeNode.isGlobal) {
                emitLine("global " + String.join(", ", scopeNode.names));
            } else {
                emitLine("nonlocal " + String.join(", ", scopeNode.names));
            }
        } else {
            for (ASTNode child : node.getChildren()) {
                visit(child);
            }
        }
    }
}