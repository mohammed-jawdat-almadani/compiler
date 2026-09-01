package output;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

// Collects syntax errors, semantic errors, warnings and the log; writes the two report files
public class CompilerReport {

    public static class Entry {
        public final String phase, file, message;
        Entry(String phase, String file, String message) { this.phase = phase; this.file = file; this.message = message; }
        @Override public String toString() { return "[" + phase + "] " + file + ": " + message; }
    }

    private final List<Entry> syntaxErrors = new ArrayList<>();
    private final List<Entry> semanticErrors = new ArrayList<>();
    private final List<Entry> warnings = new ArrayList<>();
    private final List<String> log = new ArrayList<>();
    private final List<String> analyzedFiles = new ArrayList<>();

    public List<String> getLog() { return log; }
    public List<Entry> getSyntaxErrors() { return syntaxErrors; }
    public List<Entry> getSemanticErrors() { return semanticErrors; }
    public boolean hasErrors() { return !syntaxErrors.isEmpty() || !semanticErrors.isEmpty(); }

    public void log(String message) {
        String line = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")) + "  " + message;
        log.add(line);
        System.out.println(message);
    }

    public void fileAnalyzed(String file) { analyzedFiles.add(file); }

    public void syntaxError(String file, String message) {
        syntaxErrors.add(new Entry("SYNTAX", file, message));
        System.err.println("SYNTAX ERROR in " + file + ": " + message);
    }

    public void semanticError(String file, String message) {
        semanticErrors.add(new Entry("SEMANTIC", file, message));
        System.err.println("SEMANTIC ERROR in " + file + ": " + message);
    }

    public void warning(String file, String message) {
        warnings.add(new Entry("WARNING", file, message));
    }

    // ANTLR listener that records syntax errors for one file
    public BaseErrorListener listenerFor(String file) {
        return new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                CompilerReport.this.syntaxError(file, "line " + line + ":" + charPositionInLine + " " + msg);
            }
        };
    }

    public void writeSemanticReport(Path path) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("SEMANTIC ANALYSIS REPORT\n");
        sb.append("Generated: ").append(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)).append("\n\n");
        sb.append("Files analyzed (").append(analyzedFiles.size()).append("):\n");
        for (String f : analyzedFiles) sb.append("  - ").append(f).append('\n');

        sb.append("\nSyntax errors: ").append(syntaxErrors.size()).append('\n');
        for (Entry e : syntaxErrors) sb.append("  ").append(e.file).append(": ").append(e.message).append('\n');

        sb.append("\nSemantic errors: ").append(semanticErrors.size()).append('\n');
        for (Entry e : semanticErrors) sb.append("  ").append(e.file).append(": ").append(e.message).append('\n');

        sb.append("\nWarnings: ").append(warnings.size()).append('\n');
        for (Entry e : warnings) sb.append("  ").append(e.file).append(": ").append(e.message).append('\n');

        sb.append("\nRESULT: ").append(hasErrors() ? "FAILED (" + (syntaxErrors.size() + semanticErrors.size()) + " error(s))" : "PASSED").append('\n');
        Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
    }

    public void writeGenerationLog(Path path) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("CODE GENERATION LOG\n");
        sb.append("Generated: ").append(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)).append("\n\n");
        for (String l : log) sb.append(l).append('\n');
        Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
    }
}
