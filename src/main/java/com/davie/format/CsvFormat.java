package com.davie.format;

/**
 * @author Davie
 */
public class CsvFormat {

    private char quote = '\"';
    private char newline = '\n';
    private char carriageReturn = '\r';
    private char tab = '\t';
    private String nullString = "";
    private String quoteTranslation = "\"\"";
    private String newlineTranslation = "\\n";
    private String carriageReturnTranslation = "\\r";
    private String tabTranslation = "\\t";
    private String nullStringTranslation = "\\N";

    public CsvFormat() {

    }

    public CsvFormat withQuote(char quote) {
        this.quote = quote;
        return this;
    }

    public CsvFormat withNewline(char newline) {
        this.newline = newline;
        return this;
    }

    public CsvFormat withCarriageReturn(char carriageReturn) {
        this.carriageReturn = carriageReturn;
        return this;
    }

    public CsvFormat withTab(char tab) {
        this.tab = tab;
        return this;
    }

    public CsvFormat withNullString(String nullString) {
        this.nullString = nullString;
        return this;
    }

    public CsvFormat withQuoteTranslation(String quoteTranslation) {
        this.quoteTranslation = quoteTranslation;
        return this;
    }

    public CsvFormat withNewlineTranslation(String newlineTranslation) {
        this.newlineTranslation = newlineTranslation;
        return this;
    }

    public CsvFormat withCarriageReturnTranslation(String carriageReturnTranslation) {
        this.carriageReturnTranslation = carriageReturnTranslation;
        return this;
    }

    public CsvFormat withTabTranslation(String tabTranslation) {
        this.tabTranslation = tabTranslation;
        return this;
    }

    public CsvFormat withNullStringTranslation(String nullStringTranslation) {
        this.nullStringTranslation = nullStringTranslation;
        return this;
    }

    public char getQuote() {
        return quote;
    }

    public char getNewline() {
        return newline;
    }

    public char getCarriageReturn() {
        return carriageReturn;
    }

    public char getTab() {
        return tab;
    }

    public String getNullString() {
        return nullString;
    }

    public String getQuoteTranslation() {
        return quoteTranslation;
    }

    public String getNewlineTranslation() {
        return newlineTranslation;
    }

    public String getCarriageReturnTranslation() {
        return carriageReturnTranslation;
    }

    public String getTabTranslation() {
        return tabTranslation;
    }

    public String getNullStringTranslation() {
        return nullStringTranslation;
    }
}
