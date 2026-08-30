# Builds the compiler and runs it on a project folder (default: PROJECT1).
#   .\run.ps1                       -> compiles PROJECT1, writes output\ and compiler_output\ next to it
#   .\run.ps1 path\to\project       -> compiles another project
#   .\run.ps1 PROJECT1 --verbose    -> also prints the ASTs and the symbol table
$ErrorActionPreference = "Stop"
$root = $PSScriptRoot
$jar  = Join-Path $root "Compiler_1\dependencies\antlr-4.13.2-complete.jar"
$out  = Join-Path $root "Compiler_1\out"

Write-Host "Compiling the compiler..." -ForegroundColor Cyan
$files = Get-ChildItem -Path (Join-Path $root "Compiler_1\src") -Filter *.java -Recurse | Select-Object -ExpandProperty FullName
javac -Xlint:none -cp $jar -d $out $files
if ($LASTEXITCODE -ne 0) { Write-Host "Compilation failed!" -ForegroundColor Red; exit 1 }

$project = if ($args.Count -gt 0 -and -not $args[0].StartsWith("--")) { $args[0] } else { Join-Path $root "PROJECT1" }
$flags   = $args | Where-Object { $_.StartsWith("--") }
Write-Host "Running the translator on $project" -ForegroundColor Cyan
java -cp "$jar;$out" Main $project $root @flags
exit $LASTEXITCODE
