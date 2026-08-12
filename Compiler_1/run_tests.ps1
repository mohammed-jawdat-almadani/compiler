Write-Host "Compiling project..." -ForegroundColor Cyan
$files = Get-ChildItem -Path Compiler_1\src -Filter *.java -Recurse | Select-Object -ExpandProperty FullName
javac -cp "Compiler_1\dependencies\antlr-4.13.2-complete.jar" -d Compiler_1\out $files
if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilation failed!" -ForegroundColor Red
    exit 1
}

function Run-Test {
    param([string]$testName, [string]$pyFile, [string]$htmlFile, [bool]$expectError)
    Write-Host "Running Test Case: $testName" -ForegroundColor Cyan
    $output = java -cp "Compiler_1\dependencies\antlr-4.13.2-complete.jar;Compiler_1\out" TestRunner $pyFile $htmlFile 2>&1
    
    $hasError = $output -match "ERROR" -or $output -match "Exception" -or $output -match "Semantic Error"
    
    if ($expectError) {
        if ($hasError) {
            Write-Host "PASSED: Test case correctly caught errors." -ForegroundColor Green
            Write-Host "Errors matched:" -ForegroundColor Yellow
            $output | Select-String -Pattern "(ERROR|Exception|Semantic)" | ForEach-Object { Write-Host "   $_" -ForegroundColor Yellow }
        } else {
            Write-Host "FAILED: Test case was expected to fail but passed." -ForegroundColor Red
            Write-Host $output
        }
    } else {
        if ($hasError) {
            Write-Host "FAILED: Test case was expected to pass but failed." -ForegroundColor Red
            Write-Host $output
        } else {
            Write-Host "PASSED: Test case has no errors." -ForegroundColor Green
        }
    }
}

Run-Test -testName "Valid Basic" -pyFile "test_cases\valid\app.py" -htmlFile "test_cases\valid\index.html" -expectError $false
Run-Test -testName "Valid Complex" -pyFile "test_cases\valid\complex_app.py" -htmlFile "test_cases\valid\complex_index.html" -expectError $false
Run-Test -testName "Invalid Semantic Basic" -pyFile "test_cases\invalid\app.py" -htmlFile "test_cases\invalid\index.html" -expectError $true
Run-Test -testName "Invalid Syntax" -pyFile "test_cases\syntax_error\app.py" -htmlFile "test_cases\syntax_error\index.html" -expectError $true

