package semantic;

import ast.Node;
import ast.css.*;
import ast.html.*;
import ast.jinja.*;
import symboltable.*;

public class SymbolTableVisitor extends BaseNodeVisitor<Void> {

    protected SymbolTable symtab;

    public SymbolTableVisitor(SymbolTable symtab) {
        this.symtab = symtab;
    }

    public SymbolTable getSymbolTable() {
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
        symtab.define(new WebSymbols.JinjaVariableSymbol(node.variable));
        return null;
    }

    @Override
    public Void visitForStatement(ForStatement node) {
        symtab.enterScope(new LocalScope(symtab.getCurrentScope()));

        for (String t : node.targets) {
            symtab.define(new WebSymbols.JinjaVariableSymbol(t));
        }

        super.visitForStatement(node);
        symtab.exitScope();

        return null;
    }

    @Override
    public Void visitCssStylesheet(CssStylesheet node) {
        if (node.rules != null) {
            for (Node r : node.rules) {
                visit(r);
            }
        }
        return null;
    }

    @Override
    public Void visitCssRuleSet(CssRuleSet node) {
        if (node.declarations != null) {
            for (CssDeclaration d : node.declarations) {
                visitCssDeclaration(d);
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
            symtab.define(new WebSymbols.CssVariableSymbol(node.property));
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
    public Void visitBlockStatement(ast.jinja.BlockStatement node) {
        if (node.getName() != null && !node.getName().isEmpty()) {
            symtab.define(new WebSymbols.JinjaBlockSymbol(node.getName()));
        }
        symtab.enterScope(new LocalScope(symtab.getCurrentScope()));
        if (node.getBody() != null) {
            for (var child : node.getBody()) {
                child.accept(this);
            }
        }
        symtab.exitScope();
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
        symtab.enterScope(new LocalScope(symtab.getCurrentScope()));
        if (node.rules != null) {
            for (Node r : node.rules) {
                visit(r);
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
        symtab.define(new WebSymbols.CssFeatureSymbol(node.name));
        return null;
    }

    @Override
    public Void visitIfStatement(IfStatement node) {
        symtab.enterScope(new LocalScope(symtab.getCurrentScope()));
        super.visitIfStatement(node);
        symtab.exitScope();
        return null;
    }

    @Override
    public Void visitWhileStatement(WhileStatement node) {
        symtab.enterScope(new LocalScope(symtab.getCurrentScope()));
        super.visitWhileStatement(node);
        symtab.exitScope();
        return null;
    }
}
