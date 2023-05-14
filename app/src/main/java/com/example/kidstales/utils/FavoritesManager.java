package com.example.kidstales.utils;

import com.example.kidstales.model.Story;

import java.util.ArrayList;
import java.util.List;

public class FavoritesManager {
    private static FavoritesManager instance;
    private final List<Story> favoriteStories;

    private FavoritesManager() {
        favoriteStories = new ArrayList<>();
    }

    public static FavoritesManager getInstance() {
        if (instance == null) {
            instance = new FavoritesManager();
        }
        return instance;
    }

    public List<Story> getFavoriteStories() {
        return favoriteStories;
    }

    public void addFavoriteStory(Story story) {
        favoriteStories.add(story);
    }

    public void removeFavoriteStory(Story story) {
        favoriteStories.remove(story);
    }
}
