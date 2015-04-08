package org.watertemplate.interpreter.parser;

import org.watertemplate.interpreter.lexer.Token;

import java.util.List;

public class Parser {

    private final TokenStream tokenStream;

    public Parser(final List<Token> tokens) {
        this.tokenStream = new TokenStream(tokens);
    }

    public AbstractSyntaxTree buildAbstractSyntaxTree() {
        return NonTerminal.START_SYMBOL.buildAbstractSyntaxTree(tokenStream);
    }
}
