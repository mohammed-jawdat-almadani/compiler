# Flask + Jinja Translator (مشروع المترجمات 2 — مرحلة التوليد)

A source-to-source compiler written in Java (ANTLR 4) that takes a small Flask project
(`app.py` + Jinja templates + CSS/JS) and generates ready-to-open static HTML pages, exactly as
described in the "Code Generation" announcement:

```
Flask (app.py) ──► Python Parser ──► Python AST ──► Semantic Analysis ──► Evaluator ──► Context Data
                                                                                            │
templates/*.jinja ──► Jinja Parser ──► Jinja AST ──► Semantic Analysis ──► Renderer ◄───────┘
                                                                              │
                                                              variables substituted ──► output/*.html
```

## Quick start

Requirements: JDK 11+ (`javac` / `java` on the PATH). ANTLR is bundled in `Compiler_1/dependencies`.

```powershell
# Windows
.\run.ps1         # build + translate PROJECT1
.\run_tests.ps1   # build + run every test case in test_cases\
```

```bash
# Linux / macOS
./run.sh
./run_tests.sh
```

IntelliJ: open the repo root, set a JDK, add `Compiler_1/dependencies/antlr-4.13.2-complete.jar` as a
module dependency, and run `Main` with working directory `Compiler_1`.

`run` compiles the sources into `Compiler_1/out` and executes `Main <project> <outputRoot>`.
Add `--verbose` to print the ASTs and the symbol table, `--force` to generate HTML even when
semantic errors were reported.

## Input (project folder, e.g. `PROJECT1/`)

| File | Role |
|------|------|
| `app.py` | Flask back end: the data (`products = [...]`), the routes and the `render_template(...)` calls |
| `templates/*.jinja` | Jinja templates (`index.jinja`, `add_product.jinja`, `edit_product.jinja`, plus the `base.jinja` layout) |
| `static/style.css`, `static/script.js`, `static/images/` | Supporting files, copied as-is |

## Output

```
output/                     ← what the translator produces
  index.html                ← generated (variables substituted, loops expanded, layout inherited)
  add_product.html          ← generated
  edit_product.html         ← generated
  app.py, style.css, script.js, images/   ← supporting files, copied without processing

compiler_output/            ← artifacts of the analysis and generation phases
  ast_python.json           ← Python AST (one entry per module)
  ast_jinja.json            ← Jinja/HTML AST (one entry per template)
  semantic_report.txt       ← syntax + semantic errors per file, PASSED / FAILED
  generation_log.txt        ← timestamped log of every phase (context data, routes, rendered pages, copies)
```

## How generation works

1. **Python front end** (`antlr/Python*.g4`, `python/visitor/ASTBuilder`, `python/semantic/PythonSemanticAnalyzer`)
   parses `app.py` and checks it (undefined names, redeclarations, `return` outside a function, ...).
2. **Jinja front end** (`antlr/HtmlJinja*.g4`, `builder/HtmlJinjaVisitor`, `semantic/JinjaSemanticAnalyzer`)
   parses every template. A template variable is valid if Python passes it through `render_template`,
   or it is a loop/`set` variable, or a Jinja builtin (`url_for`, `loop`, ...).
3. **Evaluator** (`runtime/PythonContextEvaluator`) interprets the data definitions and every route function
   to find each `render_template("x.jinja", key=value, ...)` call and the actual values passed —
   the *context data*. Route parameters such as `edit_product(product_id)` are sampled from the data
   (first product id) and the choice is written to the log.
4. **Renderer** (`runtime/JinjaRenderer`, `runtime/JinjaExpressionEvaluator`) walks the Jinja AST with that
   context and emits HTML: `{{ }}` substitution with filters, `{% for %}` (with `loop.*`), `{% if/elif/else %}`,
   `{% set %}`, `{% while %}`, `{% extends %}` / `{% block %}` inheritance, and `url_for()` resolved to the
   generated pages / copied static files.
5. Supporting files are copied untouched. The symbol table is used only during semantic analysis.

## Project layout

```
Compiler_1/src
  antlr/          ANTLR grammars + generated lexers/parsers (Python, HTML+Jinja, CSS)
  ast/            HTML / Jinja / CSS AST node classes
  python/ast      Python AST node classes
  builder/        parse tree -> AST (HTML/Jinja, CSS)
  python/visitor  parse tree -> AST (Python)
  symboltable/    scoped symbol table
  semantic/       Jinja semantic analysis;  python/semantic: Python semantic analysis
  runtime/        evaluator + renderer (code generation)
  output/         AST JSON serializer, reports and log
  Main.java       the pipeline
test_cases/       four mini projects (valid basic, valid full-featured, semantic errors, syntax errors) — see test_cases/README.md
```

Regenerate a parser after editing a grammar (from `Compiler_1/src`):

```
java -jar ../dependencies/antlr-4.13.2-complete.jar -visitor -listener -package antlr -o . antlr/HtmlJinjaLexer.g4 antlr/HtmlJinjaParser.g4
```
