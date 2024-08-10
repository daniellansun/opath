package me.sunlan.opath.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OPathListenerTest {
    @Test
    public void testParsing() {
        OPathLexer oPathLexer = new OPathLexer(CharStreams.fromString("/bookstore/book[price>35]/title"));
        OPathParser oPathParser = new OPathParser(new CommonTokenStream(oPathLexer));

        OPathParser.OpathContext opath = oPathParser.opath();

        ParseTreeWalker walker = new ParseTreeWalker();
        OPathListener listener = new OPathListener();
        walker.walk(listener, opath);
        assertEquals("/bookstore/book[price>35]/title<EOF>", listener.getResult());
    }
}
