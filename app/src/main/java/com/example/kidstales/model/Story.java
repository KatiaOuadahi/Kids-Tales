package com.example.kidstales.model;

public class Story {
    private int imageResource;
    private String title;
    private boolean isFavorite;

    public Story(int imageResource, String title) {
        this.imageResource = imageResource;
        this.title = title;
        this.isFavorite = false; // Initialize isFavorite to false for all stories
    }

    public int getCoverImage() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
