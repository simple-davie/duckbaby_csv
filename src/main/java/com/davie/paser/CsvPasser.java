package com.davie.paser;

import com.davie.format.CsvFormat;
import com.davie.paser.state.StartState;
import com.davie.paser.state.State;

/**
 * @author Davie
 */
public class CsvPasser {

    private CsvFormat csvFormat;
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public CsvPasser(CsvFormat csvFormat) {
        this.csvFormat = csvFormat;
        this.state = new StartState();
    }

    public void parse(String csv) {
        for (char c : csv.toCharArray()) {
            if (c == csvFormat.getQuote()) {
                state.handleQuote(this);
            } else if (c == csvFormat.getNewline()) {
                state.handleNewline(this);
            } else if (c == csvFormat.getCarriageReturn()) {
                state.handleCarriageReturn(this);
            } else if (c == csvFormat.getTab()) {
                state.handleTab(this);
            } else {
                state.handleContent(this);
            }
        }
    }

}
}
