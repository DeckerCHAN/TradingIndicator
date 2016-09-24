package com.deckerchan.tradingIndicator.entities.item;

import java.net.URL;

public class Image {
    public URL getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private URL imageUrl;
    private String description;
}
