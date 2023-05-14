package com.example.kidstales.model;
import java.util.List;

public class Story{
    private int imageResource;
    private String title;
    private boolean isFavorite;
    private List<Scene> scenes;

    public Story(int imageResource, String title ,List<Scene> scenes) {
        this.imageResource = imageResource;
        this.title = title;
        this.isFavorite = false; // Initialize isFavorite to false for all stories
        this.scenes = scenes;
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
    public List<Scene> getScenes() { return scenes; }


}
