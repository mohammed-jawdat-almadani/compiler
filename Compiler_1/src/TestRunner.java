import symboltable.SymbolTable;

public class TestRunner {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java TestRunner <python_file> <html_file>");
            System.exit(1);
        }
        
        String pythonFile = args[0];
        String htmlFile = args[1];
        
        try {
             System.out.println("Starting tests for " + pythonFile + " and " + htmlFile);
             SymbolTable globalSymTab = new SymbolTable();
             
             ASTPython.ParseFile(pythonFile, globalSymTab);
             ASTHtmlJinja.parseFile(htmlFile, globalSymTab);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
