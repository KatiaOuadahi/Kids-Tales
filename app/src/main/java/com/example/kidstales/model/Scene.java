package com.example.kidstales.model;

import java.io.Serializable;

public class Scene implements Serializable {
    private final int backgroundResourceId; // Identifiant de la ressource de l'arrière-plan de la scène
    private final int textToReadId; // Identifiant de la ressource du texte à lire dans la scène

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
