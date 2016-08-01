package com.deckerchan.tradingIndicator.api;

public final class APIQuery {
    private static APIQuery query;

    private APIQuery() {

    }

    public static APIQuery getQuery() {
        if (query == null) {
            query = new APIQuery();
        }
        return query;
    }
}
