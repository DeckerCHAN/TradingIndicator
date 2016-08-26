package com.deckerchan.tradingIndicator.core;

public final class Engine {


    private static Engine _instance;

    private Engine() {

    }

    public static Engine getEngine() {
        if (_instance == null) {
            _instance = new Engine();
        }

        return _instance;
    }

    public void run() {

    }

    public void stop() {

    }
}
