package com.deckerchan.tradingIndicator.entities;

import javafx.scene.shape.Path;

import java.util.UUID;

public class Item {
    public UUID id;
    public String name;
    public String description;
    public Path imageFilePath;

    public Path getImageFilePath() {
        return imageFilePath;
    }

    public void setImageFilePath(Path imageFilePath) {
        this.imageFilePath = imageFilePath;
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

}
