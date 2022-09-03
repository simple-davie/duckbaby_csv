package com.davie.paser.state;

import com.davie.paser.CsvPasser;

/**
 * @author Davie
 */
public interface State {

    void doAction(CsvPasser csvPasser);

    void handleQuote(CsvPasser csvPasser);

    void handleNewline(CsvPasser csvPasser);

    void handleCarriageReturn(CsvPasser csvPasser);

    void handleTab(CsvPasser csvPasser);

    void handleContent(CsvPasser csvPasser);

}
