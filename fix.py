import re

with open('ASTBuilder.java.txt', 'r', encoding='utf-16') as f:
    content = f.read()

start = content.find('public ASTNode visitImportStmt(PythonParser.ImportStmtContext ctx)')
end = content.find('public ASTNode visitContinueStmt(PythonParser.ContinueStmtContext ctx)')

if start != -1 and end != -1:
    start_override = content.rfind('@Override', 0, start)
    
    new_method = '''@Override
    public ASTNode visitImportStmt(PythonParser.ImportStmtContext ctx) {
        PythonParser.Import_stmtContext innerCtx = ctx.import_stmt();
        if (innerCtx.FROM() != null) {
            String fromModule = innerCtx.dotted_name().getText();
            java.util.Map<String, String> items = new java.util.LinkedHashMap<>();
            if (innerCtx.import_from_targets() != null) {
                PythonParser.Import_from_as_namesContext namesCtx = innerCtx.import_from_targets().import_from_as_names();
                if (namesCtx != null) {
                    for (int i = 0; i < namesCtx.name().size(); i++) {
                        String originalName = namesCtx.name(i).getText();
                        items.put(originalName, originalName);
                        symbolTable.define(new Symbol(originalName, new SymbolTable.BuiltInTypeSymbol("import")));
                    }
                }
            } else {
                for (int i = 0; i < innerCtx.getChildCount(); i++) {
                    org.antlr.v4.runtime.tree.ParseTree child = innerCtx.getChild(i);
                    if (child.getClass().getSimpleName().equals("Import_from_targetsContext")) {
                        PythonParser.Import_from_targetsContext tgts = (PythonParser.Import_from_targetsContext) child;
                        if (tgts.import_from_as_names() != null) {
                            for (int j = 0; j < tgts.import_from_as_names().name().size(); j++) {
                                String originalName = tgts.import_from_as_names().name(j).getText();
                                items.put(originalName, originalName);
                                symbolTable.define(new Symbol(originalName, new SymbolTable.BuiltInTypeSymbol("import")));
                            }
                        }
                    } else if (child.getClass().getSimpleName().equals("Import_from_as_namesContext")) {
                        PythonParser.Import_from_as_namesContext namesCtx = (PythonParser.Import_from_as_namesContext) child;
                        for (int j = 0; j < namesCtx.name().size(); j++) {
                            String originalName = namesCtx.name(j).getText();
                            items.put(originalName, originalName);
                            symbolTable.define(new Symbol(originalName, new SymbolTable.BuiltInTypeSymbol("import")));
                        }
                    }
                }
            }
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

    '''
    
    end_override = content.rfind('@Override', 0, end)
    
    new_content = content[:start_override] + new_method + content[end_override:]
    
    with open('Compiler_1/src/python/visitor/ASTBuilder.java', 'w', encoding='utf-8') as out:
        out.write(new_content)
    print("Fixed!")
else:
    print("Could not find boundaries")