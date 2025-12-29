package antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.util.*;

import static org.antlr.v4.runtime.Token.DEFAULT_CHANNEL;
import static org.antlr.v4.runtime.Token.HIDDEN_CHANNEL;

public abstract class PythonLexerBase extends Lexer {
    private Deque<Integer> indents = new ArrayDeque<>();
    private Deque<Token> tokens = new ArrayDeque<>();
    private int opened = 0, lastType = 0, lastDefault = 0;
    private Token cur, ffg;

    protected PythonLexerBase(CharStream input) { super(input); init(); }

    @Override
    public Token nextToken() {
        if (tokens.isEmpty()) {
            checkNext();
        }

        Token t = tokens.pollFirst();


        return (t != null) ? t : super.nextToken();
    }

    @Override public void reset() { init(); super.reset(); }

    private void init() {
        indents.clear(); tokens.clear();
        opened = lastType = lastDefault = 0;
        cur = ffg = null;
    }

    private void checkNext() {
        if (lastType == EOF) return;

        if (indents.isEmpty()) {
            enqueue(new CommonToken(PythonLexer.ENCODING, "utf-8"), HIDDEN_CHANNEL);
            fetch();
            handleStart();
        } else {
            fetch();
        }

        switch (cur.getType()) {
            case PythonLexer.NEWLINE -> handleNL();
            case PythonLexer.LPAR, PythonLexer.LSQB, PythonLexer.LBRACE -> { opened++; enqueue(cur); }
            case PythonLexer.RPAR, PythonLexer.RSQB, PythonLexer.RBRACE -> { opened--; enqueue(cur); }
            case PythonLexer.ERRORTOKEN -> report("Error: " + cur.getText());
            case EOF -> handleEOF();
            default -> enqueue(cur);
        }
    }

    private void fetch() {
        cur = (ffg == null) ? super.nextToken() : ffg;
        ffg = (cur.getType() == EOF) ? cur : super.nextToken();
    }

    private void handleStart() {
        indents.push(0);
        while (cur.getType() != EOF) {
            if (cur.getChannel() == DEFAULT_CHANNEL) {
                if (cur.getType() == PythonLexer.NEWLINE) enqueue(cur, HIDDEN_CHANNEL);
                else return;
            } else enqueue(cur);
            fetch();
        }
    }

    private void handleNL() {
        if (opened > 0) {
            enqueue(cur, HIDDEN_CHANNEL);
        } else {
            Token nl = new CommonToken(cur);
            if (ffg.getType() == PythonLexer.WS) fetch();

            if (ffg.getType() == PythonLexer.NEWLINE || ffg.getType() == PythonLexer.COMMENT) {
                enqueue(nl, HIDDEN_CHANNEL);
            } else {
                enqueue(nl);
                updateIndents(ffg.getType() == EOF ? 0 : getLen(cur.getText()));
            }
        }
    }

    private void updateIndents(int len) {
        int prev = indents.isEmpty() ? 0 : indents.peek();
        if (len > prev) {
            addSyntheticToken(PythonLexer.INDENT);
            indents.push(len);
        } else {
            while (!indents.isEmpty() && len < indents.peek()) {
                indents.pop();
                if (!indents.isEmpty() && len <= indents.peek()) {
                    addSyntheticToken(PythonLexer.DEDENT);
                } else {
                    report("Inconsistent dedent");
                }
            }
        }
    }

    private void handleEOF() {
        if (lastDefault != PythonLexer.NEWLINE && lastDefault != PythonLexer.DEDENT && lastDefault > 0) {
            addSyntheticToken(PythonLexer.NEWLINE);
        }
        updateIndents(0);
        enqueue(cur);
    }

    private void enqueue(Token t) { enqueue(t, t.getChannel()); }

    private void enqueue(Token t, int ch) {
        CommonToken ct = new CommonToken(t);
        ct.setChannel(ch);
        lastType = ct.getType();
        if (ch == DEFAULT_CHANNEL) lastDefault = lastType;
        tokens.addLast(ct);
    }

    private void addSyntheticToken(int type) {
        CommonToken t = new CommonToken(cur);
        t.setType(type);
        t.setText("<" + getVocabulary().getDisplayName(type) + ">");
        t.setChannel(DEFAULT_CHANNEL);
        enqueue(t);
    }

    private int getLen(String s) {
        int l = 0;
        for (char c : s.toCharArray()) l += (c == '\t') ? (8 - l % 8) : (c == ' ' ? 1 : 0);
        return l;
    }

    private void report(String m) {
        getErrorListenerDispatch().syntaxError(this, cur, cur.getLine(), cur.getCharPositionInLine(), m, null);
    }
}