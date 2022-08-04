package com.davie.format;

public class CsvFormat {
    public static final CsvFormat DEFAULT = new CsvFormat();
    public static final CsvFormat RFC4180 = new CsvFormat("\n", "\r", ",", "\\", "\"");
    private String newline = "\n";
    private String carriageReturn = "\r";
    private String tab = ",";
    private String translation = "\\";
    private String quote = "\"";

    private CsvFormat(String newline, String carriageReturn, String tab, String translation, String quote) {
        this.newline = newline;
        this.carriageReturn = carriageReturn;
        this.tab = tab;
        this.translation = translation;
        this.quote = quote;
    }

    public CsvFormat() {
    }

    public CsvFormat create() {
        return new CsvFormat();
    }

    public CsvFormat withNewline(String newline) {
        this.newline = newline;
        return this;
    }

    public CsvFormat withCarriageReturn(String carriageReturn) {
        this.carriageReturn = carriageReturn;
        return this;
    }

    public CsvFormat withTab(String tab) {
        this.tab = tab;
        return this;
    }

    public CsvFormat withTranslation(String translation) {
        this.translation = translation;
        return this;
    }

    public CsvFormat withQuote(String quote) {
        this.quote = quote;
        return this;
    }
}
