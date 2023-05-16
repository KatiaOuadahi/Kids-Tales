package com.example.kidstales.model;

public class Scene {
    private final int backgroundResourceId;
    private final int  textToReadId;

    public Scene(int backgroundResourceId, int textToRead) {
        this.backgroundResourceId = backgroundResourceId;
        this.textToReadId = textToRead;
    }

    public int getBackgroundResourceId() {
        return backgroundResourceId;
    }


    public int getText() {
        return textToReadId;
    }

}