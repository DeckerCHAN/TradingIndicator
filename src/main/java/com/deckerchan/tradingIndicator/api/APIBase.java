package com.deckerchan.tradingIndicator.api;

import com.deckerchan.tradingIndicator.protocol.Result;

import java.util.Map;

public interface APIBase {
    void execute(Map<String, String[]> args);

    Result getResult();

    void selfRegister();
}
