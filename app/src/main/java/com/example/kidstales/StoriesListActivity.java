package com.example.kidstales;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidstales.adapter.StoryAdapter;
import com.example.kidstales.data.StoriesDataSource;

public class StoriesListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ImageButton viewButton;
    private boolean isGridView = true;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories_list);

        // Recherche des vues dans le layout
        recyclerView = findViewById(R.id.grid_recycler_view);
        viewButton = findViewById(R.id.ib_view);

        // Définition du comportement lors du clic sur le bouton view
        viewButton.setOnClickListener(v -> toggleView());

        setGridView(); // Définition de la vue initiale en tant que grille

        // Recherche du bouton showFavorites dans le layout
        ImageButton showFavorites = findViewById(R.id.ib_ShowFavorites);

        // Définition du comportement lors du clic sur le bouton showFavorites
        showFavorites.setOnClickListener(v -> {
            Intent intent = new Intent(StoriesListActivity.this, FavoritesActivity.class);
            startActivity(intent);
        });

        // Recherche du bouton backToMain dans le layout
        ImageButton backToMain = findViewById(R.id.ib_backToMain);

        // Définition du comportement lors du clic sur le bouton backToMain
        backToMain.setOnClickListener(v -> {
            Intent intent = new Intent(StoriesListActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void setGridView() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        StoryAdapter adapter = new StoryAdapter(context, StoriesDataSource.getStories(), R.layout.item_grid_view, false);
        recyclerView.setAdapter(adapter);
        isGridView = true;
        viewButton.setImageResource(R.drawable.ic_list_view); // Définition de l'icône en vue de liste
    }

    private void setListView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        StoryAdapter adapter = new StoryAdapter(context, StoriesDataSource.getStories(), R.layout.item_vertical_view, false);
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
