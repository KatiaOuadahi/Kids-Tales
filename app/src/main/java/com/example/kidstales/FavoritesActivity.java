package com.example.kidstales;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidstales.adapter.StoryAdapter;
import com.example.kidstales.model.Story;
import com.example.kidstales.utils.FavoritesManager;

import java.util.List;

public class FavoritesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ImageButton viewButton;
    private boolean isGridView = true;
    private List<Story> favoriteStories;
    private StoryAdapter adapter;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        // Recherche des vues dans le layout
        recyclerView = findViewById(R.id.grid_recycler_view);
        viewButton = findViewById(R.id.ib_view);
        LinearLayout linearLayout = findViewById(R.id.ll_noFavorites);

        // Définition du comportement lors du clic sur le bouton view
        viewButton.setOnClickListener(v -> toggleView());

        // Récupération des histoires favorites depuis FavoritesManager
        FavoritesManager favoritesManager = FavoritesManager.getInstance();
        favoriteStories = favoritesManager.getFavoriteStories();
        Log.d("MY_TAG_FavoritesActivity", "Favorite stories size: " + favoriteStories.size());

        if (favoriteStories.isEmpty()) {
            linearLayout.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        } else {
            linearLayout.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
            setGridView(); // Définition de la vue initiale en tant que grille
        }

        // Recherche du bouton backToStoriesList dans le layout
        ImageButton backToStoriesList = findViewById(R.id.ib_backToStoriesList);

        // Définition du comportement lors du clic sur le bouton backToStoriesList
        backToStoriesList.setOnClickListener(v -> {
            Intent intent = new Intent(FavoritesActivity.this, StoriesListActivity.class);
            startActivity(intent);
        });
    }

    private void setGridView() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new StoryAdapter(context, favoriteStories, R.layout.item_grid_view, true);
        recyclerView.setAdapter(adapter);
        isGridView = true;
        viewButton.setImageResource(R.drawable.ic_list_view); // Définition de l'icône en vue de liste
    }

    private void setListView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new StoryAdapter(context, favoriteStories, R.layout.item_vertical_view, true);
        recyclerView.setAdapter(adapter);
        isGridView = false;
        viewButton.setImageResource(R.drawable.ic_grid_view); // Définition de l'icône en vue de grille
    }

    private void toggleView() {
        if (isGridView) {
            setListView();
        } else {
            setGridView();
        }
    }
}
