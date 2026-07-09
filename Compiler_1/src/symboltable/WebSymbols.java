package symboltable;

public class WebSymbols {

    public static class JinjaBlockSymbol extends Symbol {
        public JinjaBlockSymbol(String name) {
            super(name);
        }
    }

    public static class JinjaVariableSymbol extends Symbol {
        public JinjaVariableSymbol(String name) {
            super(name);
        }
    }

    public static class CssVariableSymbol extends Symbol {
        public CssVariableSymbol(String name) {
            super(name);
        }
    }

    public static class CssFeatureSymbol extends Symbol {
        public CssFeatureSymbol(String name) {
            super(name);
        }
    }
}
