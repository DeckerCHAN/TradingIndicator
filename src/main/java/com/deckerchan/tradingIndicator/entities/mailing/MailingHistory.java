package com.deckerchan.tradingIndicator.entities.mailing;

import java.time.LocalDate;
import java.util.TreeMap;

public final class MailingHistory {
    private TreeMap<String, LocalDate> history;
    public TreeMap<String, LocalDate> getHistory() {
        return history;
    }

    public void setHistory(TreeMap<String, LocalDate> history) {
        this.history = history;
    }
}
