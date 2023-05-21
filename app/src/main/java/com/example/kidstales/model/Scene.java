package com.example.kidstales.model;

import java.io.Serializable;

public class Scene implements Serializable {
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