package com.example.kidstales.model;

public class Story {
    private int imageResource;
    private String title;

    public Story(int imageResource, String title) {
        this.imageResource = imageResource;
        this.title = title;
    }

    public int getCoverImage() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }
}
