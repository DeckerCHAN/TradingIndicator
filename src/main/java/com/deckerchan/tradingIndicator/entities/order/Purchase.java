package com.deckerchan.tradingIndicator.entities.order;

import com.deckerchan.tradingIndicator.entities.item.Item;

public final class Purchase {
    private Item item;
    private int number;
    private float finalUnitPrice;
    private PurchaseStatus status;

    public PurchaseStatus getStatus() {
        return status;
    }

    public void setStatus(PurchaseStatus status) {
        this.status = status;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getFinalUnitPrice() {
        return finalUnitPrice;
    }

    public void setFinalUnitPrice(float finalUnitPrice) {
        this.finalUnitPrice = finalUnitPrice;
    }
}
