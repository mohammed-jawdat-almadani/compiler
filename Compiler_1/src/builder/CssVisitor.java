package builder;

import antlr.cssParser;
import antlr.cssParserBaseVisitor;
import ast.Node;
import ast.css.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CssVisitor extends cssParserBaseVisitor<Node> {

    @Override
    public Node visitStylesheet(cssParser.StylesheetContext ctx) {
        List<Node> rules = new ArrayList<>();
        for (var stmt : ctx.nestedStatement()) {
            Node node = visit(stmt);
            if (node != null) rules.add(node);
        }
        return new CssStylesheet(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), rules);
    }

    @Override
    public Node visitKnownRuleset(cssParser.KnownRulesetContext ctx) {
        List<CssSelector> selectors = ctx.selectorGroup().selector().stream()
                .map(s -> (CssSelector) visit(s))
                .collect(Collectors.toList());

        List<CssDeclaration> declarations = new ArrayList<>();
        if (ctx.declarationList() != null) {
            for (var d : ctx.declarationList().declaration()) {
                declarations.add((CssDeclaration) visit(d));
            }
        }

        return new CssRuleSet(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), selectors, declarations);
    }

    @Override
    public Node visitSelector(cssParser.SelectorContext ctx) {
        return new CssSelector(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getText());
    }

    @Override
    public Node visitKnownDeclaration(cssParser.KnownDeclarationContext ctx) {
        String property = ctx.property_().getText();
        String value = ctx.expr().getText();
        return new CssDeclaration(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), property, value);
    }

    @Override
    public Node visitMedia(cssParser.MediaContext ctx) {
        String media = ctx.mediaQueryList().getText();
        List<Node> rules = new ArrayList<>();
        for (var r : ctx.groupRuleBody().nestedStatement()) {
            Node node = visit(r);
            if (node != null) rules.add(node);
        }
        return new CssMediaRule(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), media, rules);
    }

    @Override
    public Node visitFontFaceRule(cssParser.FontFaceRuleContext ctx) {
        List<CssDeclaration> declarations = new ArrayList<>();
        for (var dctx : ctx.fontFaceDeclaration()) {
            declarations.add((CssDeclaration) visit(dctx));
        }
        return new CssFontFaceRule(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), declarations);
    }

    @Override
    public Node visitKeyframesRule(cssParser.KeyframesRuleContext ctx) {
        String name = ctx.ident().getText();
        List<CssKeyframeBlock> blocks = new ArrayList<>();
        for (var b : ctx.keyframeBlock()) {
            blocks.add((CssKeyframeBlock) visit(b));
        }
        return new CssKeyframesRule(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), name, blocks);
    }

    @Override
    public Node visitKeyframeBlock(cssParser.KeyframeBlockContext ctx) {
        // نقسم الـ selector على الفواصل
        List<String> selectors = List.of(ctx.keyframeSelector().getText().split("\\s*,\\s*"));

        List<CssDeclaration> declarations = new ArrayList<>();
        if (ctx.declarationList() != null) {
            for (var d : ctx.declarationList().declaration()) {
                declarations.add((CssDeclaration) visit(d));
            }
        }

        return new CssKeyframeBlock(
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine(),
                selectors,       // نرسل القائمة بدل String واحد
                declarations
        );
    }

    @Override
    public Node visitSupportsRule(cssParser.SupportsRuleContext ctx) {
        String condition = ctx.supportsCondition().getText();
        List<Node> rules = new ArrayList<>();
        for (var r : ctx.groupRuleBody().nestedStatement()) {
            rules.add(visit(r));
        }
        return new CssSupportsRule(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), condition, rules);
    }

    @Override
    public Node visitViewport(cssParser.ViewportContext ctx) {
        List<CssDeclaration> declarations = new ArrayList<>();
        if (ctx.declarationList() != null) {
            for (var d : ctx.declarationList().declaration()) {
                declarations.add((CssDeclaration) visit(d));
            }
        }
        return new CssViewport(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), declarations);
    }

    @Override
    public Node visitCounterStyle(cssParser.CounterStyleContext ctx) {
        String name = ctx.ident().getText();
        List<CssDeclaration> declarations = new ArrayList<>();
        if (ctx.declarationList() != null) {
            for (var d : ctx.declarationList().declaration()) {
                declarations.add((CssDeclaration) visit(d));
            }
        }
        return new CssCounterStyle(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), name, declarations);
    }

    @Override
    public Node visitFontFeatureValuesRule(cssParser.FontFeatureValuesRuleContext ctx) {
        List<CssFeatureValueBlock> blocks = new ArrayList<>();
        for (var b : ctx.featureValueBlock()) {
            blocks.add((CssFeatureValueBlock) visit(b));
        }
        return new CssFontFeatureValuesRule(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), blocks);
    }

    @Override
    public Node visitFeatureValueBlock(cssParser.FeatureValueBlockContext ctx) {
        String type = ctx.featureType().getText();
        List<CssFeatureValueDefinition> defs = new ArrayList<>();
        for (var d : ctx.featureValueDefinition()) {
            defs.add((CssFeatureValueDefinition) visit(d));
        }
        return new CssFeatureValueBlock(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), type, defs);
    }

    @Override
    public Node visitFeatureValueDefinition(cssParser.FeatureValueDefinitionContext ctx) {
        String name = ctx.ident().getText();
        List<String> values = ctx.number().stream().map(n -> n.getText()).toList();
        return new CssFeatureValueDefinition(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), name, values);
    }

    // Fallback
    @Override
    public Node visitAny_(cssParser.Any_Context ctx) {
        return null;
    }
}
