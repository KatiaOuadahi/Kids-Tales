package com.example.kidstales.utils;

import android.util.Log;

import com.example.kidstales.model.Story;

import java.util.ArrayList;
import java.util.List;

public class FavoritesManager {
    private static final String MY_TAG = "FavoritesManager";
    private static FavoritesManager instance;
    private List<Story> favoriteStories;

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
        Log.d(MY_TAG, "Before adding favorite story: " + story.getTitle());
        favoriteStories.add(story);
        Log.d(MY_TAG, "Added favorite story: " + story.getTitle());
    }

    public void removeFavoriteStory(Story story) {
        favoriteStories.remove(story);
    }
}
