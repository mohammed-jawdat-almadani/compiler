# Builds the compiler and runs every test case in test_cases\ (each one is a mini project).
# Results are written inside each case folder: <case>\output\ and <case>\compiler_output\
$ErrorActionPreference = "Continue"
$root = $PSScriptRoot
$jar  = Join-Path $root "Compiler_1\dependencies\antlr-4.13.2-complete.jar"
$out  = Join-Path $root "Compiler_1\out"

Write-Host "Compiling the compiler..." -ForegroundColor Cyan
$files = Get-ChildItem -Path (Join-Path $root "Compiler_1\src") -Filter *.java -Recurse | Select-Object -ExpandProperty FullName
javac -Xlint:none -cp $jar -d $out $files
if ($LASTEXITCODE -ne 0) { Write-Host "Compilation failed!" -ForegroundColor Red; exit 1 }

$failed = 0
Get-ChildItem -Path (Join-Path $root "test_cases") -Directory | Sort-Object Name | ForEach-Object {
    $case = $_.FullName
    $name = $_.Name
    $expectErrors = $name -notmatch "valid"
    Write-Host ""
    Write-Host ("=" * 70) -ForegroundColor DarkGray
    $expected = if ($expectErrors) { "errors reported, no generation" } else { "HTML generated" }
    Write-Host "TEST CASE: $name   (expected: $expected)" -ForegroundColor Cyan
    Write-Host ("=" * 70) -ForegroundColor DarkGray
    Remove-Item -Recurse -Force (Join-Path $case "output"), (Join-Path $case "compiler_output") -ErrorAction SilentlyContinue
    $null = & java -cp "$jar;$out" Main $case $case 2>&1
    $code = $LASTEXITCODE
    Get-Content (Join-Path $case "compiler_output\semantic_report.txt") | Select-String -Pattern "errors:|^  |RESULT" | ForEach-Object { Write-Host "   $_" }
    $generated = Get-ChildItem (Join-Path $case "output") -Filter *.html -ErrorAction SilentlyContinue | ForEach-Object { $_.Name }
    if ($generated) { Write-Host "   generated: $($generated -join ', ')" -ForegroundColor Gray }
    if (($expectErrors -and $code -ne 0) -or (-not $expectErrors -and $code -eq 0)) {
        Write-Host "   PASSED" -ForegroundColor Green
    } else {
        Write-Host "   FAILED (exit code $code)" -ForegroundColor Red
        $script:failed++
    }
}

Write-Host ""
if ($failed -eq 0) { Write-Host "All test cases passed." -ForegroundColor Green } else { Write-Host "$failed test case(s) failed." -ForegroundColor Red; exit 1 }
