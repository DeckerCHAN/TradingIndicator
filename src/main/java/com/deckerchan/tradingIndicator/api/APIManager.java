package com.deckerchan.tradingIndicator.api;

public final class APIManager {
    private static APIManager manager;

    private APIManager() {

    }

    public static APIManager getManager() {
        if (manager == null) {
            manager = new APIManager();
        }
        return manager;
    }
}
