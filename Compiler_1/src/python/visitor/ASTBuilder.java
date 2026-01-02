package python.visitor;

import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;
import python.ast.*;
import python.symboltable.*;


import java.util.ArrayList;
import java.util.List;


public class ASTBuilder extends PythonParserBaseVisitor<ASTNode> {

    private SymbolTable symbolTable;

    public ASTBuilder() {
        this.symbolTable = new SymbolTable();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }



    @Override
    public ASTNode visitFile(PythonParser.FileContext ctx) {
        BlockNode rootBlock = new BlockNode(0);
        if (ctx.statements() != null) {
            for (PythonParser.StatementContext stmtCtx : ctx.statements().statement()) {
                ASTNode node = visit(stmtCtx);
                if (node instanceof StatementNode) {
                    rootBlock.addStatement((StatementNode) node);
                }
            }
        }
        return rootBlock;
    }

    @Override
    public ASTNode visitBlock(PythonParser.BlockContext ctx) {
        BlockNode block = new BlockNode(ctx.getStart().getLine());



        if (ctx.statements() != null) {
            for (PythonParser.StatementContext stmt : ctx.statements().statement()) {
                ASTNode node = visit(stmt);
                if (node instanceof StatementNode) {
                    block.addStatement((StatementNode) node);
                }
            }
        } else if (ctx.simple_stmts() != null) {
            ASTNode node = visit(ctx.simple_stmts());
            if (node instanceof BlockNode) {
                block.statements.addAll(((BlockNode) node).statements);
            } else if (node instanceof StatementNode) {
                block.addStatement((StatementNode) node);
            }
        }
        return block;
    }

    @Override
    public ASTNode visitSimple_stmts(PythonParser.Simple_stmtsContext ctx) {
        BlockNode block = new BlockNode(ctx.getStart().getLine());
        for (PythonParser.Simple_stmtContext s : ctx.simple_stmt()) {
            ASTNode node = visit(s);
            if (node instanceof StatementNode) {
                block.addStatement((StatementNode) node);
            }
        }
        return block.statements.size() == 1 ? block.statements.get(0) : block;
    }



    @Override
    public ASTNode visitFuncDefStmt(PythonParser.FuncDefStmtContext ctx) {
        List<DecoratorNode> decorators = new ArrayList<>();
        if (ctx.decorators() != null) {
            for (PythonParser.PrimaryContext p : ctx.decorators().primary()) {
                decorators.add(new DecoratorNode(visit(p), p.getStart().getLine()));
            }
        }

        PythonParser.Function_defContext funcCtx = ctx.function_def();
        String funcName = funcCtx.name().getText();


        Type returnType = new SymbolTable.BuiltInTypeSymbol("dynamic");
        FunctionSymbol functionSymbol = new FunctionSymbol(funcName, returnType, symbolTable.getCurrentScope());
        symbolTable.define(functionSymbol);

        symbolTable.enterScope(functionSymbol);

        List<String> params = new ArrayList<>();
        if (funcCtx.params() != null) {
            for (PythonParser.ParamContext p : funcCtx.params().param()) {
                String paramName = p.name().getText();
                params.add(paramName);

                VariableSymbol paramSym = new VariableSymbol(paramName, new SymbolTable.BuiltInTypeSymbol("dynamic"));
                symbolTable.define(paramSym);
            }
        }

        BlockNode body = (BlockNode) visit(funcCtx.block());

        symbolTable.exitScope();

        return new FunctionDefNode(funcName, params, body, decorators, funcCtx.getStart().getLine());
    }

    @Override
    public ASTNode visitClassDefStmt(PythonParser.ClassDefStmtContext ctx) {
        List<DecoratorNode> decorators = new ArrayList<>();
        if (ctx.decorators() != null) {
            for (PythonParser.PrimaryContext p : ctx.decorators().primary()) {
                decorators.add(new DecoratorNode(visit(p), p.getStart().getLine()));
            }
        }

        PythonParser.Class_defContext classCtx = ctx.class_def();
        String className = classCtx.name().getText();



        symbolTable.define(new Symbol(className, new SymbolTable.BuiltInTypeSymbol("class")));

        LocalScope classScope = new LocalScope(symbolTable.getCurrentScope());
        symbolTable.enterScope(classScope);

        BlockNode body = (BlockNode) visit(classCtx.block());

        symbolTable.exitScope();

        return new ClassDefNode(className, body, decorators, classCtx.getStart().getLine());
    }



    @Override
    public ASTNode visitAssignment(PythonParser.AssignmentContext ctx) {
        int line = ctx.getStart().getLine();

        if (ctx.targets() != null && !ctx.targets().isEmpty()) {
            ASTNode value = null;
            if (ctx.expressions() != null) value = visit(ctx.expressions());
            else if (ctx.yield_expr() != null) value = visit(ctx.yield_expr());

            ASTNode targetNode = visit(ctx.targets(0));


            if (targetNode instanceof IdentifierNode) {
                String varName = ((IdentifierNode) targetNode).name;

                Symbol existingSymbol = symbolTable.resolve(varName);


                if (existingSymbol == null || existingSymbol.scope != symbolTable.getCurrentScope()) {
                    VariableSymbol varSym = new VariableSymbol(varName, new SymbolTable.BuiltInTypeSymbol("dynamic"));
                    symbolTable.define(varSym);
                }
            }

            return new AssignmentNode(targetNode, value, line);
        }

        if (ctx.augassign() != null) {
            ASTNode target = visit(ctx.target());
            ASTNode value = ctx.expressions() != null ? visit(ctx.expressions()) : visit(ctx.yield_expr());
            String op = ctx.augassign().getText();


            return new AugmentedAssignNode(target, op, value, line);
        }

        return null;
    }



    @Override
    public ASTNode visitIfStmt(PythonParser.IfStmtContext ctx) { return visit(ctx.if_stmt()); }

    @Override
    public ASTNode visitIf_stmt(PythonParser.If_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        BlockNode thenBlock = (BlockNode) visit(ctx.block());
        BlockNode elseBlock = null;

        if (ctx.else_block() != null) {
            elseBlock = (BlockNode) visit(ctx.else_block().block());
        }

        if (ctx.elif_stmt() != null && !ctx.elif_stmt().isEmpty()) {
            for (int i = ctx.elif_stmt().size() - 1; i >= 0; i--) {
                PythonParser.Elif_stmtContext elifCtx = ctx.elif_stmt(i);
                ExpressionNode elifCond = (ExpressionNode) visit(elifCtx.expression());
                BlockNode elifBody = (BlockNode) visit(elifCtx.block());
                BlockNode wrapperBlock = new BlockNode(elifCtx.getStart().getLine());
                wrapperBlock.addStatement(new IfNode(elifCond, elifBody, elseBlock, elifCtx.getStart().getLine()));
                elseBlock = wrapperBlock;
            }
        }
        return new IfNode(condition, thenBlock, elseBlock, line);
    }

    @Override
    public ASTNode visitWhileStmt(PythonParser.WhileStmtContext ctx) { return visit(ctx.while_stmt()); }

    @Override
    public ASTNode visitWhile_stmt(PythonParser.While_stmtContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        BlockNode body = (BlockNode) visit(ctx.block());
        return new WhileNode(condition, body, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitForStmt(PythonParser.ForStmtContext ctx) { return visit(ctx.for_stmt()); }

    @Override
    public ASTNode visitFor_stmt(PythonParser.For_stmtContext ctx) {
        ASTNode target = visit(ctx.targets());

        if (target instanceof IdentifierNode) {
            String varName = ((IdentifierNode) target).name;
            symbolTable.define(new VariableSymbol(varName, new SymbolTable.BuiltInTypeSymbol("int")));
        }

        ASTNode iter = visit(ctx.expressions());
        BlockNode body = (BlockNode) visit(ctx.block());
        return new ForNode(target, iter, body, null, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAssignStmt(PythonParser.AssignStmtContext ctx) { return visit(ctx.assignment()); }

    @Override
    public ASTNode visitAddSubExpr(PythonParser.AddSubExprContext ctx) {
        ASTNode left = visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            ASTNode right = visit(ctx.term(i));
            String op = ctx.getChild(2 * i - 1).getText();
            left = new BinaryOpNode(left, op, right, ctx.getStart().getLine());
        }
        return left;
    }

    @Override
    public ASTNode visitMulDivExpr(PythonParser.MulDivExprContext ctx) {
        ASTNode left = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            ASTNode right = visit(ctx.factor(i));
            String op = ctx.getChild(2 * i - 1).getText();
            left = new BinaryOpNode(left, op, right, ctx.getStart().getLine());
        }
        return left;
    }

    @Override
    public ASTNode visitComparison(PythonParser.ComparisonContext ctx) {
        if (ctx.bitwise_or().size() == 1) return visit(ctx.bitwise_or(0));
        ASTNode left = visit(ctx.bitwise_or(0));
        for (int i = 1; i < ctx.bitwise_or().size(); i++) {
            ASTNode right = visit(ctx.bitwise_or(i));
            String op = ctx.compare_op(i-1).getText();
            left = new BinaryOpNode(left, op, right, ctx.getStart().getLine());
        }
        return left;
    }

    @Override
    public ASTNode visitLogicalExpr(PythonParser.LogicalExprContext ctx) {
        if (ctx.IF() != null) {
            ASTNode trueExpr = visit(ctx.disjunction(0));
            ASTNode condition = visit(ctx.disjunction(1));
            ASTNode falseExpr = visit(ctx.expression());
            return new TernaryOpNode(condition, trueExpr, falseExpr, ctx.getStart().getLine());
        }
        return visit(ctx.disjunction(0));
    }

    @Override
    public ASTNode visitNumberAtom(PythonParser.NumberAtomContext ctx) {
        String text = ctx.getText();
        String type = text.contains(".") ? "float" : "int";
        return new LiteralNode(text, type, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitStringAtom(PythonParser.StringAtomContext ctx) {
        return new LiteralNode(ctx.getText(), "string", ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitNameAtom(PythonParser.NameAtomContext ctx) {
        return new IdentifierNode(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitTrueAtom(PythonParser.TrueAtomContext ctx) {
        return new LiteralNode("True", "bool", ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitFalseAtom(PythonParser.FalseAtomContext ctx) {
        return new LiteralNode("False", "bool", ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitListAtom(PythonParser.ListAtomContext ctx) {
        List<ExpressionNode> elements = new ArrayList<>();
        if (ctx.expressions() != null) {
            for (PythonParser.ExpressionContext expr : ctx.expressions().expression()) {
                elements.add((ExpressionNode) visit(expr));
            }
        }
        return new ListNode(elements, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitCallExpr(PythonParser.CallExprContext ctx) {
        ASTNode func = visit(ctx.primary());
        List<ExpressionNode> args = new ArrayList<>();
        if (ctx.arguments() != null) {
            for (PythonParser.ExpressionContext e : ctx.arguments().expression()) {
                args.add((ExpressionNode) visit(e));
            }
        }
        return new FunctionCallNode(func, args, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAttributeExpr(PythonParser.AttributeExprContext ctx) {
        ASTNode object = visit(ctx.primary());
        String name = ctx.name().getText();
        return new AttributeAccessNode(object, name, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitSubscriptExpr(PythonParser.SubscriptExprContext ctx) {
        ASTNode container = visit(ctx.primary());
        ASTNode index = visit(ctx.slices().slice(0));
        return new SubscriptNode(container, index, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitSlice(PythonParser.SliceContext ctx) {
        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            return visit(ctx.expression(0));
        }
        return new LiteralNode("slice", "unknown", ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitReturnStmt(PythonParser.ReturnStmtContext ctx) {
        PythonParser.Return_stmtContext innerCtx = ctx.return_stmt();
        ASTNode val = null;
        if (innerCtx.expressions() != null) {
            val = visit(innerCtx.expressions());
        }
        return new ReturnNode((ExpressionNode) val, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitImportStmt(PythonParser.ImportStmtContext ctx) {
        PythonParser.Import_stmtContext innerCtx = ctx.import_stmt();
        if (innerCtx.FROM() != null) {
            String fromModule = innerCtx.dotted_name().getText();
            java.util.Map<String, String> items = new java.util.HashMap<>();
            return new FromImportNode(fromModule, items, ctx.getStart().getLine());
        } else {
            java.util.Map<String, String> modules = new java.util.LinkedHashMap<>();
            if (innerCtx.dotted_as_names() != null) {
                PythonParser.Dotted_as_namesContext namesCtx = innerCtx.dotted_as_names();
                for (int i = 0; i < namesCtx.dotted_name().size(); i++) {
                    String originalName = namesCtx.dotted_name(i).getText();
                    modules.put(originalName, originalName);
                    symbolTable.define(new Symbol(originalName, new SymbolTable.BuiltInTypeSymbol("module")));
                }
            }
            return new ImportNode(modules, ctx.getStart().getLine());
        }
    }

    @Override
    public ASTNode visitBreakStmt(PythonParser.BreakStmtContext ctx) {
        return new FlowControlNode(FlowControlNode.Type.BREAK, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitContinueStmt(PythonParser.ContinueStmtContext ctx) {
        return new FlowControlNode(FlowControlNode.Type.CONTINUE, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitPassStmt(PythonParser.PassStmtContext ctx) {
        return new FlowControlNode(FlowControlNode.Type.PASS, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitTargets(PythonParser.TargetsContext ctx) {
        if (ctx.target().size() == 1) return visit(ctx.target(0));
        return visit(ctx.target(0));
    }

    @Override
    public ASTNode visitTarget(PythonParser.TargetContext ctx) {
        if (ctx.name() != null) return new IdentifierNode(ctx.name().getText(), ctx.getStart().getLine());
        if (ctx.primary() != null) return visit(ctx.primary());
        return null;
    }
}
