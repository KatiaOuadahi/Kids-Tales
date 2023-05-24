package com.example.kidstales.model;

import java.io.Serializable;
import java.util.List;

public class Story implements Serializable {
    private final int imageResource;
    private final int titleResourceId;
    private boolean isFavorite;
    private List<Scene> scenes;

    public Story(int imageResource, int titleResourceId, List<Scene> scenes) {
        this.imageResource = imageResource;
        this.titleResourceId = titleResourceId;
        this.isFavorite = false; // Initialise isFavorite à false pour toutes les histoires
        this.scenes = scenes;
    }

    public int getCoverImage() {
        return imageResource;
    }

    public int getTitleResourceId() {
        return titleResourceId;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public List<Scene> getScenes() {
        return scenes;
    }
}
