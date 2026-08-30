#!/usr/bin/env bash
# Builds the compiler and runs every test case in test_cases/ (each one is a mini project).
# Results are written inside each case folder: <case>/output/ and <case>/compiler_output/
set -u
ROOT="$(cd "$(dirname "$0")" && pwd)"
JAR="$ROOT/Compiler_1/dependencies/antlr-4.13.2-complete.jar"
OUT="$ROOT/Compiler_1/out"

echo "Compiling the compiler..."
mkdir -p "$OUT"
javac -Xlint:none -cp "$JAR" -d "$OUT" $(find "$ROOT/Compiler_1/src" -name '*.java') || { echo "Compilation failed!"; exit 1; }

failed=0
for case in "$ROOT"/test_cases/*/; do
  name="$(basename "$case")"
  case "$name" in *valid*) expect_errors=false;; *) expect_errors=true;; esac
  echo; echo "======================================================================"
  echo "TEST CASE: $name   (expected: $([ $expect_errors = true ] && echo 'errors reported, no generation' || echo 'HTML generated'))"
  echo "======================================================================"
  rm -rf "$case/output" "$case/compiler_output"
  java -cp "$JAR:$OUT" Main "$case" "$case" >/dev/null 2>&1; code=$?
  grep -E 'errors:|^  |RESULT' "$case/compiler_output/semantic_report.txt" | sed 's/^/   /'
  ls "$case/output"/*.html >/dev/null 2>&1 && echo "   generated: $(cd "$case/output" && ls *.html | tr '\n' ' ')"
  if { [ $expect_errors = true ] && [ $code -ne 0 ]; } || { [ $expect_errors = false ] && [ $code -eq 0 ]; }; then
    echo "   PASSED"
  else
    echo "   FAILED (exit code $code)"; failed=$((failed+1))
  fi
done

echo
if [ $failed -eq 0 ]; then echo "All test cases passed."; else echo "$failed test case(s) failed."; exit 1; fi
