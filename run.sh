#!/usr/bin/env bash
# Builds the compiler and runs it on a project folder (default: PROJECT1).
#   ./run.sh                      -> compiles PROJECT1, writes output/ and compiler_output/ in the repo root
#   ./run.sh path/to/project      -> compiles another project
#   ./run.sh PROJECT1 --verbose   -> also prints the ASTs and the symbol table
set -e
ROOT="$(cd "$(dirname "$0")" && pwd)"
JAR="$ROOT/Compiler_1/dependencies/antlr-4.13.2-complete.jar"
OUT="$ROOT/Compiler_1/out"

echo "Compiling the compiler..."
mkdir -p "$OUT"
javac -Xlint:none -cp "$JAR" -d "$OUT" $(find "$ROOT/Compiler_1/src" -name '*.java')

PROJECT="$ROOT/PROJECT1"; FLAGS=()
for a in "$@"; do case "$a" in --*) FLAGS+=("$a");; *) PROJECT="$a";; esac; done
echo "Running the translator on $PROJECT"
java -cp "$JAR:$OUT" Main "$PROJECT" "$ROOT" "${FLAGS[@]}"
