package builder;

import antlr.*;
import ast.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class JinjaVisitor extends jinjaParserBaseVisitor<Node> {

    // -------- Program --------
    @Override
    public Node visitProgram(jinjaParser.ProgramContext ctx) {
        JinjaNode root = new JinjaNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        for (jinjaParser.StatementContext stmt : ctx.statement()) {
            Node child = visit(stmt);
            if (child != null) root.addChild(child);
        }
        return root;
    }

    // -------- Text or Evaluation --------
    @Override
    public Node visitText_or_eval(jinjaParser.Text_or_evalContext ctx) {
        if (ctx.TEXT() != null) {
            return new JinjaTextNode(ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    ctx.getText());
        }
        return visitChildren(ctx); // evaluation statements
    }

    @Override
    public Node visitEvaluation_statement(jinjaParser.Evaluation_statementContext ctx) {
        Node expr = ctx.expression() != null ? visit(ctx.expression()) : visit(ctx.boolean_expression());
        return new JinjaPrintNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), expr);
    }

    // -------- Assignment --------
    @Override
    public Node visitAssignment_statement(jinjaParser.Assignment_statementContext ctx) {
        Node expr = visit(ctx.expression());
        return new JinjaAssignmentNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.ID().getText(), expr);
    }

    // -------- Expression --------
    @Override
    public Node visitEqDouble(jinjaParser.EqDoubleContext ctx) {
        return new JinjaExpressionNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.DOUBLE().getText());
    }

    @Override
    public Node visitEqInt(jinjaParser.EqIntContext ctx) {
        return new JinjaExpressionNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.INT().getText());
    }

    @Override
    public Node visitEqString(jinjaParser.EqStringContext ctx) {
        return new JinjaExpressionNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.STRING().getText());
    }

    @Override
    public Node visitEqVar(jinjaParser.EqVarContext ctx) {
        return new JinjaExpressionNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.ID().getText());
    }

    @Override
    public Node visitEqAdd(jinjaParser.EqAddContext ctx) {
        String text = visit(ctx.left).toString() + " " + ctx.operator.getText() + " " + visit(ctx.right).toString();
        return new JinjaExpressionNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), text);
    }

    @Override
    public Node visitEqMul(jinjaParser.EqMulContext ctx) {
        String text = visit(ctx.left).toString() + " " + ctx.operator.getText() + " " + visit(ctx.right).toString();
        return new JinjaExpressionNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), text);
    }

    @Override
    public Node visitEqPar(jinjaParser.EqParContext ctx) {
        return visit(ctx.expression());
    }

    // -------- Boolean Expression --------
    @Override
    public Node visitEqBoolPar(jinjaParser.EqBoolParContext ctx) {
        return visit(ctx.boolean_expression());
    }

    @Override
    public Node visitRelationExpr(jinjaParser.RelationExprContext ctx) {
        JinjaBooleanExpressionNode node = new JinjaBooleanExpressionNode(ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine());
        node.left = ctx.left.getText();
        node.operator = ctx.operator.getText();
        node.right = ctx.right.getText();
        return node;
    }

    @Override
    public Node visitBoolEq(jinjaParser.BoolEqContext ctx) {
        JinjaBooleanExpressionNode node = new JinjaBooleanExpressionNode(ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine());
        node.left = ctx.left.getText();
        node.operator = ctx.operator.getText();
        node.right = ctx.right.getText();
        return node;
    }

    @Override
    public Node visitEqBool(jinjaParser.EqBoolContext ctx) {
        JinjaBooleanExpressionNode node = new JinjaBooleanExpressionNode(ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine());
        node.literalValue = Boolean.parseBoolean(ctx.BOOL().getText());
        return node;
    }

    // -------- If / Elif / Else --------
    @Override
    public Node visitIf_statement(jinjaParser.If_statementContext ctx) {
        JinjaIfNode ifNode = (JinjaIfNode) visit(ctx.if_fragment());
        for (jinjaParser.StatementContext stmt : ctx.statement()) {
            ifNode.ifBody.add(visit(stmt));
        }
        if (ctx.elif_statement() != null) ifNode.followUp = visit(ctx.elif_statement());
        if (ctx.else_statement() != null) ifNode.followUp = visit(ctx.else_statement());
        return ifNode;
    }

    @Override
    public Node visitIf_fragment(jinjaParser.If_fragmentContext ctx) {
        return new JinjaIfNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                (JinjaBooleanExpressionNode) visit(ctx.boolean_expression()));
    }

    @Override
    public Node visitElif_statement(jinjaParser.Elif_statementContext ctx) {
        JinjaElifNode node = (JinjaElifNode) visit(ctx.elif_fragment());
        for (jinjaParser.StatementContext stmt : ctx.statement()) {
            node.elifBody.add(visit(stmt));
        }
        if (ctx.elif_statement() != null) node.followUp = visit(ctx.elif_statement());
        if (ctx.else_statement() != null) node.followUp = visit(ctx.else_statement());
        return node;
    }

    @Override
    public Node visitElif_fragment(jinjaParser.Elif_fragmentContext ctx) {
        return new JinjaElifNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                (JinjaBooleanExpressionNode) visit(ctx.boolean_expression()));
    }

    @Override
    public Node visitElse_statement(jinjaParser.Else_statementContext ctx) {
        JinjaElseNode node = new JinjaElseNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        for (jinjaParser.StatementContext stmt : ctx.statement()) {
            node.elseBody.add(visit(stmt));
        }
        return node;
    }

    // -------- While --------
    @Override
    public Node visitWhile_statement(jinjaParser.While_statementContext ctx) {
        JinjaWhileNode node = new JinjaWhileNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                (JinjaBooleanExpressionNode) visit(ctx.while_fragment().boolean_expression()));
        for (jinjaParser.StatementContext stmt : ctx.statement()) {
            node.loopBody.add(visit(stmt));
        }
        return node;
    }

    // -------- For --------
    @Override
    public Node visitFor_statement(jinjaParser.For_statementContext ctx) {
        JinjaForNode node = new JinjaForNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.for_fragment().ID(0).getText(),
                ctx.for_fragment().ID(1).getText());
        for (jinjaParser.StatementContext stmt : ctx.statement()) {
            node.loopBody.add(visit(stmt));
        }
        return node;
    }
}
