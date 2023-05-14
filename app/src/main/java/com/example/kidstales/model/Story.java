package com.example.kidstales.model;

public class Story {
    private int imageResource;
    private int titleResourceId;
    private boolean isFavorite;

    public Story(int imageResource, int  titleResourceId) {
        this.imageResource = imageResource;
        this.titleResourceId = titleResourceId;
        this.isFavorite = false; // Initialize isFavorite to false for all stories
    }

    public int getCoverImage() {
        return imageResource;
    }

    public int getTitleResourceId() {return titleResourceId; }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
