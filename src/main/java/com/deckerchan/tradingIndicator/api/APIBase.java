package com.deckerchan.tradingIndicator.api;

import com.deckerchan.tradingIndicator.entities.protocol.Result;

public interface APIBase {
    void execute();

    Result getResult();

    void selfRegister();
}
