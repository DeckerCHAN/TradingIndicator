package com.deckerchan.tradingIndicator.api;

public class APINotFoundException extends Exception {
    public APINotFoundException(String apiName) {
        super(String.format("No api with path of %s found!", apiName));
    }
}
