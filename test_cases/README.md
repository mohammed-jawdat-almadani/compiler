# Test cases

Each folder is a complete mini project (`app.py` + `templates/`) that is compiled with the
same `Main` used for `PROJECT1`. The results land inside the case folder
(`<case>/output/` and `<case>/compiler_output/`), so every case can be shown on its own.

Run all of them:

```powershell
.\run_tests.ps1          # Windows
./run_tests.sh           # Linux / macOS
```

Run one case from IntelliJ: use the `Main` run configuration with Program arguments
`..\test_cases\1_basic_valid ..\test_cases\1_basic_valid` (project folder, then output root).

| Case | What it shows | Expected |
|------|---------------|----------|
| `1_basic_valid` | The exact example from the announcement: a `products` list in `app.py`, a `{% for %}` loop with `{{ product.name }}` in `index.jinja`. | `output/index.html` with the two products substituted; `semantic_report.txt` says PASSED. |
| `2_full_features_valid` | Everything the generator supports: template inheritance (`extends`/`block`), `if/elif/else`, `set`, filters (`length`, `upper`, `join`, `default`, `round`), tests (`is odd`), `loop.index`/`loop.last`, inline `if` expressions, `url_for` to pages and static files, data computed by Python helper functions, a route with a parameter. | `index.html` and `product.html` generated, `style.css` copied; PASSED. |
| `3_semantic_errors` | Code that parses but is wrong: undefined variables, `return` outside a function, a redeclared function, a call to an undefined function, a template that does not exist, template variables that Python never passes. | 8 semantic errors listed per file in `semantic_report.txt` (RESULT: FAILED); no HTML generated; exit code 1. |
| `4_syntax_errors` | Broken Python (`def index(` never closed) and broken Jinja (`{% for %}` tag never closed, `{{ }}` never closed). | Syntax errors with line:column for both files; generation skipped; exit code 1. |
