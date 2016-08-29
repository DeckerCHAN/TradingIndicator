package com.deckerchan.tradingIndicator.api;

import java.util.Hashtable;

public final class APIManager {
    private static APIManager manager;
    private Hashtable<String, APIBase> APIMap;

    private APIManager() {
        this.APIMap = new Hashtable<String, APIBase>();
    }

    public static APIManager getManager() {
        if (manager == null) {
            manager = new APIManager();
        }
        return manager;
    }

    private Hashtable<String, APIBase> getAPIMap() {
        return APIMap;
    }

    private void setAPIMap(Hashtable<String, APIBase> APIMap) {
        this.APIMap = APIMap;
    }

    public void registerAPI(String path, APIBase api) {
        if (this.getAPIMap().containsKey(path)) {
            throw new RuntimeException("Key already exists!");
        }
        this.getAPIMap().put(path, api);
    }

    public APIBase getAPI(String path) throws APINotFoundException {
        if (!this.getAPIMap().contains(path)) {
            throw new APINotFoundException(path);
        }
        return this.getAPIMap().get(path);
    }


}
