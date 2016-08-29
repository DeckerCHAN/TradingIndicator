package com.deckerchan.tradingIndicator.entities.item;

import java.util.UUID;

public final class Item {
    private UUID id;
    private String name;
    private String description;
    private Image itemImage;
    private float historicalPrice;

    public Image getItemImage() {
        return itemImage;
    }

    public void setItemImage(Image itemImage) {
        this.itemImage = itemImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public float getHistoricalPrice() {
        return historicalPrice;
    }

    public void setHistoricalPrice(float historicalPrice) {
        this.historicalPrice = historicalPrice;
    }
}
