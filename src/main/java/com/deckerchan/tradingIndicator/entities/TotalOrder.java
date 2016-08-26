package com.deckerchan.tradingIndicator.entities;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public class TotalOrder {
    public UUID id;
    public LocalDateTime orderTime;
    public String comment;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
