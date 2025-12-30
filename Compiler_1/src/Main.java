//import ast.Node;
//import builder.ASTBuilder;
//import antlr.*;
//import builder.CssVisitor;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import semantic.SymbolTableVisitor;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        String input = """
//            /* Simple modern styling for the Products App */
//                     :root {
//                       --bg: #0b1020;
//                       --panel: #111831;
//                       --panel-2: #0f1630;
//                       --text: #e8ecff;
//                       --muted: #a9b2d6;
//                       --brand: #7aa2ff;
//                       --brand-2: #67e8f9;
//                       --danger: #ff6b6b;
//                       --ok: #22c55e;
//                       --border: rgba(255, 255, 255, 0.1);
//                       --shadow: 0 10px 30px rgba(0, 0, 0, 0.35);
//                       --radius: 16px;
//                       --radius-sm: 12px;
//                       --max: 1050px;
//                       --font: ui-sans-serif, system-ui, -apple-system, Segoe UI, Roboto, Helvetica,
//                         Arial, "Noto Sans", "Apple Color Emoji", "Segoe UI Emoji";
//                     }
//                     * {
//                       box-sizing: border-box;
//                     }
//                     html,
//                     body {
//                       height: 100%;
//                     }
//                     body {
//                       margin: 0;
//                       font-family: var(--font);
//                       color: var(--text);
//                       background: radial-gradient(
//                           1200px 600px at 20% 10%,
//                           rgba(122, 162, 255, 0.25),
//                           transparent 55%
//                         ),
//                         radial-gradient(
//                           900px 500px at 80% 20%,
//                           rgba(103, 232, 249, 0.18),
//                           transparent 60%
//                         ),
//                         linear-gradient(180deg, var(--bg), #070a14 70%);
//                     }
//                     a {
//                       color: inherit;
//                       text-decoration: none;
//                     }
//                     .container {
//                       max-width: var(--max);
//                       margin: 0 auto;
//                       padding: 24px;
//                     }
//                     .header {
//                       display: flex;
//                       align-items: center;
//                       justify-content: space-between;
//                       gap: 16px;
//                       padding: 18px 22px;
//                       background: rgba(17, 24, 49, 0.7);
//                       border: 1px solid var(--border);
//                       border-radius: var(--radius);
//                       box-shadow: var(--shadow);
//                       backdrop-filter: blur(10px);
//                     }
//                     .brand {
//                       display: flex;
//                       flex-direction: column;
//                       gap: 2px;
//                     }
//                     .brand .title {
//                       font-size: 20px;
//                       font-weight: 800;
//                       letter-spacing: 0.3px;
//                     }
//                     .brand .subtitle {
//                       font-size: 13px;
//                       color: var(--muted);
//                     }
//                     .nav {
//                       display: flex;
//                       gap: 10px;
//                       flex-wrap: wrap;
//                     }
//                     .pill {
//                       display: inline-flex;
//                       align-items: center;
//                       gap: 8px;
//                       padding: 10px 12px;
//                       border-radius: 999px;
//                       border: 1px solid var(--border);
//                       background: rgba(15, 22, 48, 0.6);
//                       transition: transform 0.12s ease, border-color 0.12s ease,
//                         background 0.12s ease;
//                     }
//                     .pill:hover {
//                       transform: translateY(-1px);
//                       border-color: rgba(122, 162, 255, 0.45);
//                       background: rgba(15, 22, 48, 0.85);
//                     }
//                     .main {
//                       margin-top: 18px;
//                       background: rgba(17, 24, 49, 0.55);
//                       border: 1px solid var(--border);
//                       border-radius: var(--radius);
//                       box-shadow: var(--shadow);
//                       backdrop-filter: blur(10px);
//                       padding: 22px;
//                     }
//                     .h1 {
//                       font-size: 24px;
//                       margin: 0 0 8px 0;
//                       font-weight: 800;
//                     }
//                     .muted {
//                       color: var(--muted);
//                     }
//                     .grid {
//                       display: grid;
//                       grid-template-columns: repeat(auto-fit, minmax(240px, 1fr));
//                       gap: 14px;
//                       margin-top: 14px;
//                     }
//                     .card {
//                       border: 1px solid var(--border);
//                       border-radius: var(--radius);
//                       background: rgba(15, 22, 48, 0.7);
//                       overflow: hidden;
//                       display: flex;
//                       flex-direction: column;
//                       min-height: 320px;
//                     }
//                     .card .img {
//                       width: 100%;
//                       aspect-ratio: 4 / 3;
//                       background: linear-gradient(
//                         135deg,
//                         rgba(122, 162, 255, 0.18),
//                         rgba(103, 232, 249, 0.1)
//                       );
//                       display: flex;
//                       align-items: center;
//                       justify-content: center;
//                     }
//                     .card .img img {
//                       max-width: 78%;
//                       max-height: 78%;
//                       object-fit: contain;
//                       filter: drop-shadow(0 12px 18px rgba(0, 0, 0, 0.4));
//                     }
//                     .card .body {
//                       padding: 14px 14px 12px 14px;
//                       display: flex;
//                       flex-direction: column;
//                       gap: 10px;
//                       flex: 1;
//                     }
//                     .card .name {
//                       font-weight: 800;
//                       font-size: 16px;
//                     }
//                     .price {
//                       display: inline-flex;
//                       align-items: center;
//                       gap: 8px;
//                       font-weight: 700;
//                       color: var(--brand-2);
//                     }
//                     .actions {
//                       display: flex;
//                       gap: 10px;
//                       margin-top: auto;
//                       flex-wrap: wrap;
//                     }
//                     .btn {
//                       display: inline-flex;
//                       align-items: center;
//                       justify-content: center;
//                       padding: 10px 12px;
//                       border-radius: 12px;
//                       border: 1px solid var(--border);
//                       background: rgba(17, 24, 49, 0.75);
//                       cursor: pointer;
//                       transition: transform 0.12s ease, border-color 0.12s ease,
//                         background 0.12s ease;
//                       font-weight: 700;
//                     }
//                     .btn:hover {
//                       transform: translateY(-1px);
//                       border-color: rgba(122, 162, 255, 0.45);
//                       background: rgba(17, 24, 49, 0.95);
//                     }
//                     .btn.primary {
//                       border-color: rgba(122, 162, 255, 0.55);
//                       background: rgba(122, 162, 255, 0.16);
//                     }
//                     .btn.danger {
//                       border-color: rgba(255, 107, 107, 0.55);
//                       background: rgba(255, 107, 107, 0.12);
//                     }
//                     .btn.danger:hover {
//                       border-color: rgba(255, 107, 107, 0.75);
//                       background: rgba(255, 107, 107, 0.18);
//                     }
//                     .form {
//                       display: grid;
//                       gap: 12px;
//                       max-width: 560px;
//                     }
//                     .field {
//                       display: grid;
//                       gap: 6px;
//                     }
//                     label {
//                       font-weight: 700;
//                     }
//                     input,
//                     textarea {
//                       width: 100%;
//                       padding: 11px 12px;
//                       border-radius: 12px;
//                       border: 1px solid var(--border);
//                       background: rgba(15, 22, 48, 0.75);
//                       color: var(--text);
//                       outline: none;
//                     }
//                     input:focus,
//                     textarea:focus {
//                       border-color: rgba(122, 162, 255, 0.65);
//                     }
//                     textarea {
//                       min-height: 110px;
//                       resize: vertical;
//                     }
//                     .helper {
//                       font-size: 12px;
//                       color: var(--muted);
//                     }
//                     .split {
//                       display: grid;
//                       grid-template-columns: 320px 1fr;
//                       gap: 18px;
//                     }
//                     @media (max-width: 820px) {
//                       .split {
//                         grid-template-columns: 1fr;
//                       }
//                     }
//                     .panel {
//                       border: 1px solid var(--border);
//                       border-radius: var(--radius);
//                       background: rgba(15, 22, 48, 0.7);
//                       padding: 14px;
//                     }
//                     .badge {
//                       display: inline-flex;
//                       align-items: center;
//                       gap: 8px;
//                       padding: 6px 10px;
//                       border-radius: 999px;
//                       border: 1px solid rgba(103, 232, 249, 0.45);
//                       background: rgba(103, 232, 249, 0.1);
//                       color: var(--brand-2);
//                       font-weight: 800;
//                       font-size: 12px;
//                     }
//                     .footer {
//                       margin-top: 14px;
//                       font-size: 12px;
//                       color: var(--muted);
//                       text-align: center;
//                     }
//
//            /* باقي الكود كما هو */
//        """;
//
//        // 1. تحويل النص إلى CharStream
//        CharStream cs = CharStreams.fromString(input);
//
//        // 2. تهيئة Lexer و Parser
//        cssLexer lexer = new cssLexer(cs);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        cssParser parser = new cssParser(tokens);
//
//        // 3. بناء ParseTree
//        ParseTree tree = parser.stylesheet();
//
//        // 4. استخدام CssVisitor لبناء AST
//        CssVisitor visitor = new CssVisitor();
//        Node ast = (Node) visitor.visit(tree);
//
//        // 5. طباعة AST
//        System.out.println("============================== [ CSS AST ] ==============================");
//        System.out.println(ast);
//
//        System.out.println("============================== [ ST ] ==============================");
//        SymbolTableVisitor symVisitor = new SymbolTableVisitor();
//        symVisitor.visit(ast);
//        symVisitor.getSymbolTable().dump();
//    }
//}


import ast.Node;
import builder.ASTBuilder;
import antlr.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.SymbolTableVisitor;


public class Main {
    public static void main(String[] args) throws Exception {
        String input = """
            {% extends "base.html" %}
            <html>
                <style>
                /* Simple modern styling for the Products App */
                        :root {
                          --bg: #0b1020;
                          --panel: #111831;
                          --panel-2: #0f1630;
                          --text: #e8ecff;
                          --muted: #a9b2d6;
                          --brand: #7aa2ff;
                          --brand-2: #67e8f9;
                          --danger: #ff6b6b;
                          --ok: #22c55e;
                          --border: rgba(255, 255, 255, 0.1);
                          --shadow: 0 10px 30px rgba(0, 0, 0, 0.35);
                          --radius: 16px;
                          --radius-sm: 12px;
                          --max: 1050px;
                          --font: ui-sans-serif, system-ui, -apple-system, Segoe UI, Roboto, Helvetica,
                            Arial, "Noto Sans", "Apple Color Emoji", "Segoe UI Emoji";
                        }
                        * {
                          box-sizing: border-box;
                        }
                        html,
                        body {
                          height: 100%;
                        }
                        body {
                          margin: 0;
                          font-family: var(--font);
                          color: var(--text);
                          background: radial-gradient(
                              1200px 600px at 20% 10%,
                              rgba(122, 162, 255, 0.25),
                              transparent 55%
                            ),
                            radial-gradient(
                              900px 500px at 80% 20%,
                              rgba(103, 232, 249, 0.18),
                              transparent 60%
                            ),
                            linear-gradient(180deg, var(--bg), #070a14 70%);
                        }
                </style>
                {% set name = "Abdullah" %} {% set color = "red" %}
                {% if name == "Abdullah" %}
                <p style="color: red; font-size: 25px;">{{ name }} Age: 22</p>
                {% else %}
                <p style="color: {{ color }}; font-size: 20px;">{{ x }} Hello Else Age: 22</p>
                {% endif %}
            </html>
        """;

        CharStream cs = CharStreams.fromString(input);
        HtmlJinjaLexer lexer = new HtmlJinjaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HtmlJinjaParser parser = new HtmlJinjaParser(tokens);

        ParseTree tree = parser.htmlDocument();

        ASTBuilder builder = new ASTBuilder();
        Node ast = builder.buildHtml(tree);

        //  [AST]
        System.out.println("============================== [ AST ] ==============================");
        System.out.println(ast);

        //  [Symbol Table]
        System.out.println("============================== [ ST ] ==============================");
        SymbolTableVisitor symVisitor = new SymbolTableVisitor();
        symVisitor.visit(ast);
        symVisitor.getSymbolTable().dump();
    }
}
