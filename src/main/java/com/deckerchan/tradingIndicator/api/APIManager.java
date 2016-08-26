package com.deckerchan.tradingIndicator.api;

import java.util.HashMap;

public final class APIManager {
    private static APIManager manager;
    private HashMap<String, APIBase> APIMap;

    private APIManager() {
        this.APIMap = new HashMap<String, APIBase>();
    }

    public static APIManager getManager() {
        if (manager == null) {
            manager = new APIManager();
        }
        return manager;
    }

    public HashMap<String, APIBase> getAPIMap() {
        return APIMap;
    }

    private void setAPIMap(HashMap<String, APIBase> APIMap) {
        this.APIMap = APIMap;
    }

    public void registerAPI(String key, APIBase api) {
        if(this.getAPIMap().containsKey(key))
        {
            throw new RuntimeException("Key already exists!");
        }
        this.getAPIMap().put(key, api);
    }


}
