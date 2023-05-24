package com.example.kidstales.utils;

import com.example.kidstales.model.Story;

import java.util.ArrayList;
import java.util.List;

public class FavoritesManager {
    private static FavoritesManager instance;
    private final List<Story> favoriteStories;

    private FavoritesManager() {
        favoriteStories = new ArrayList<>(); // Initialisation de la liste des histoires favorites
    }

    public static FavoritesManager getInstance() {
        if (instance == null) {
            instance = new FavoritesManager(); // Création d'une seule instance de FavoritesManager
        }
        return instance;
    }

    public List<Story> getFavoriteStories() {
        return favoriteStories; // Renvoie la liste des histoires favorites
    }

    public void addFavoriteStory(Story story) {
        favoriteStories.add(story); // Ajoute une histoire à la liste des favoris
    }

    public void removeFavoriteStory(Story story) {
        favoriteStories.remove(story); // Supprime une histoire de la liste des favoris
    }
}
