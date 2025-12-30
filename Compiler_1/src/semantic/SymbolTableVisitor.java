package semantic;

import ast.Node;
import ast.css.*;
import ast.html.*;
import ast.jinja.*;
import symbol_table.SymbolTableManager;

public class SymbolTableVisitor extends BaseNodeVisitor<Void> {

    private final SymbolTableManager symtab = new SymbolTableManager();

    public SymbolTableManager getSymbolTable() {
        return symtab;
    }

    @Override
    public Void visitHtmlAttribute(HtmlAttribute node) {
        if (node.value instanceof CssStylesheet cssSheet) {
            visit(cssSheet);
        } else if (node.value instanceof CssDeclarationList declList) {
            visit(declList);
        }
        return null;
    }

    @Override
    public Void visitHtmlTagContent(HtmlTagContent node) {
        return null;
    }

    @Override
    public Void visitHtmlElement(HtmlElement node) {
        if (node.children != null) {
            for (Node child : node.children) {
                if (child instanceof CssStylesheet cssNode) {
                    visitCssStylesheet(cssNode);
                } else {
                    visit(child);
                }
            }
        }
        return null;
    }

    @Override
    public Void visitExtendsStatement(ExtendsStatement node) {
        return null;
    }

    @Override
    public Void visitAssignmentStatement(AssignmentStatement node) {
        symtab.define(node.variable, "any", node.line, node.column);
        return null;
    }

    @Override
    public Void visitForStatement(ForStatement node) {
        symtab.enterScope();

        for (String t : node.targets)
            symtab.define(t, "any", node.line, node.column);

        super.visitForStatement(node); // 👈 يكمل traversal
        symtab.exitScope();

        return null;
    }

    @Override
    public Void visitCssStylesheet(CssStylesheet node) {
        if (node.rules != null) {
            for (Node r : node.rules) {
                visit(r); // زيارة كل rule داخل الـ stylesheet
            }
        }
        return null;
    }

    @Override
    public Void visitCssRuleSet(CssRuleSet node) {
        if (node.declarations != null) {
            for (CssDeclaration d : node.declarations) {
                visitCssDeclaration(d); // زيارة كل declaration
            }
        }
        return null;
    }

    @Override
    public Void visitCssSelector(CssSelector node) {
        return null;
    }

    @Override
    public Void visitCssDeclaration(CssDeclaration node) {
        if (node.property.startsWith("--")) {
            symtab.define(node.property, "css-var", node.line, node.column);
        }
        return null;
    }

    @Override
    public Void visitCssDeclarationList(CssDeclarationList node) {
        for (Node decl : node.declarations) {
            visit(decl);
        }
        return null;
    }

    @Override
    public Void visitStyle(Style node) {
        if (node.node instanceof CssStylesheet cssSheet) {
            visitCssStylesheet(cssSheet);
        } else {
            visit(node.node);
        }
        return null;
    }



    @Override
    public Void visitHtmlAttributeValue(HtmlAttributeValue node) {
        return null;
    }

    @Override
    public Void visitHtmlStyleAttribute(HtmlStyleAttribute node) {
        return null;
    }

    @Override
    public Void visitCssMediaRule(CssMediaRule node) {
        symtab.enterScope(); // Scope جديد لكل media
        if (node.rules != null) {
            for (Node r : node.rules) {
                visit(r); // زيارة كل rule داخل media
            }
        }
        symtab.exitScope();
        return null;
    }

    @Override
    public Void visitCssFontFaceRule(CssFontFaceRule node) {
        return null;
    }

    @Override
    public Void visitCssKeyframesRule(CssKeyframesRule node) {
        return null;
    }

    @Override
    public Void visitCssKeyframeBlock(CssKeyframeBlock node) {
        return null;
    }

    @Override
    public Void visitCssSupportsRule(CssSupportsRule node) {
        return null;
    }

    @Override
    public Void visitCssViewport(CssViewport node) {
        return null;
    }

    @Override
    public Void visitCssCounterStyle(CssCounterStyle node) {
        return null;
    }

    @Override
    public Void visitCssFontFeatureValuesRule(CssFontFeatureValuesRule node) {
        return null;
    }

    @Override
    public Void visitCssFeatureValueBlock(CssFeatureValueBlock node) {
        return null;
    }

    @Override
    public Void visitCssFeatureValueDefinition(CssFeatureValueDefinition node) {
        symtab.define(node.name, "css-feature", node.line, node.column);
        return null;
    }

    @Override
    public Void visitIfStatement(IfStatement node) {
        symtab.enterScope();
        super.visitIfStatement(node);
        symtab.exitScope();
        return null;
    }

    @Override
    public Void visitWhileStatement(WhileStatement node) {
        symtab.enterScope();
        super.visitWhileStatement(node);
        symtab.exitScope();
        return null;
    }
}
