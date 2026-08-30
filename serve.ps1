# Builds the compiler, generates PROJECT1 and serves it live on http://localhost:8000/
# Every add / edit / delete: the route is executed by the translator's Python evaluator,
# data.py is rewritten, all pages are regenerated, and the browser is redirected.
#   .\serve.ps1                    -> PROJECT1 on port 8000
#   .\serve.ps1 path\to\project 9000
$ErrorActionPreference = "Stop"
$root = $PSScriptRoot
$jar  = Join-Path $root "Compiler_1\dependencies\antlr-4.13.2-complete.jar"
$out  = Join-Path $root "Compiler_1\out"

Write-Host "Compiling the compiler..." -ForegroundColor Cyan
$files = Get-ChildItem -Path (Join-Path $root "Compiler_1\src") -Filter *.java -Recurse | Select-Object -ExpandProperty FullName
javac -Xlint:none -cp $jar -d $out $files
if ($LASTEXITCODE -ne 0) { Write-Host "Compilation failed!" -ForegroundColor Red; exit 1 }

$project = if ($args.Count -gt 0) { $args[0] } else { Join-Path $root "PROJECT1" }
$port    = if ($args.Count -gt 1) { $args[1] } else { 8000 }
java -cp "$jar;$out" DevServer $project $root $port
