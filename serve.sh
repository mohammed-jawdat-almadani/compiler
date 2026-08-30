#!/usr/bin/env bash
# Builds the compiler, generates PROJECT1 and serves it live on http://localhost:8000/
set -e
ROOT="$(cd "$(dirname "$0")" && pwd)"
JAR="$ROOT/Compiler_1/dependencies/antlr-4.13.2-complete.jar"
OUT="$ROOT/Compiler_1/out"
mkdir -p "$OUT"
javac -Xlint:none -cp "$JAR" -d "$OUT" $(find "$ROOT/Compiler_1/src" -name '*.java')
java -cp "$JAR:$OUT" DevServer "${1:-$ROOT/PROJECT1}" "$ROOT" "${2:-8000}"
