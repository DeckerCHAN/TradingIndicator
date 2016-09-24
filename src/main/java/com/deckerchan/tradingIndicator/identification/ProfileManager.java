package com.deckerchan.tradingIndicator.identification;

/**
 * Created by deckerchan on 24/09/16.
 */
public final class ProfileManager {
    public LoginAPI getApi() {
        return api;
    }

    private void setApi(LoginAPI api) {
        this.api = api;
    }

    LoginAPI api;

    public ProfileManager() {
        this.api = new LoginAPI();
        this.api.selfRegister();
    }
}
