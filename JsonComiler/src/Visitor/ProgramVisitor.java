package Visitor;

import AST.Program;
import antlr.JsonParser;

public class ProgramVisitor {
    @Override
    public Program visitJson(JsonParser.JsonContext ctx) {
        Program program = null;
        JsonVisitor jsonVisitor = new JsonVisitor();
        program = new Program(jsonVisitor.visit(ctx.getChild(0)));
        return program;
    }
}
