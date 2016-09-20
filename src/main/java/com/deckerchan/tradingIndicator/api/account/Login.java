package com.deckerchan.tradingIndicator.api.account;

import com.deckerchan.tradingIndicator.api.APIBase;
import com.deckerchan.tradingIndicator.api.APIManager;
import com.deckerchan.tradingIndicator.entities.protocol.Result;

public class Login implements APIBase {

    @Override
    public void execute() {

    }

    @Override
    public Result getResult() {
        return null;
    }

    @Override
    public void selfRegister() {
        APIManager.getManager().registerAPI("login",this);
    }
}
