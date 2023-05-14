package com.example.kidstales.model;

public class Scene {
    private int backgroundResourceId;
    private String textToRead;

    public Scene(int backgroundResourceId, String textToRead) {
        this.backgroundResourceId = backgroundResourceId;
        this.textToRead = textToRead;
    }

    public int getBackgroundResourceId() {
        return backgroundResourceId;
    }


    public String getText() {
        return textToRead;
    }

}