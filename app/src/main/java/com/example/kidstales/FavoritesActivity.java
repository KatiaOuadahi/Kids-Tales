package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.kidstales.adapter.StoryAdapter;
import com.example.kidstales.model.Story;
import com.example.kidstales.utils.FavoritesManager;

import java.util.List;

public class FavoritesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private TextView textView;
    private ImageButton viewButton;
    private boolean isGridView = true;
    private List<Story> favoriteStories;
    private StoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        recyclerView = findViewById(R.id.grid_recycler_view);
        viewButton = findViewById(R.id.ib_view);
        textView = findViewById(R.id.tv_noFavorites);

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleView();
            }
        });

        // Retrieve the favorite stories from FavoritesManager
        FavoritesManager favoritesManager = FavoritesManager.getInstance();
        favoriteStories = favoritesManager.getFavoriteStories();
        Log.d("MY_TAG_FavoritesActivity", "Favorite stories size: " + favoriteStories.size());



        if (favoriteStories.isEmpty()) {
            textView.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        } else {
            textView.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);


            setGridView(); // Set initial view as grid view
        }
    }

    private void setGridView() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new StoryAdapter(this, favoriteStories, R.layout.item_grid_view, true);
        recyclerView.setAdapter(adapter);
        isGridView = true;
        viewButton.setImageResource(R.drawable.ic_list_view); // Set icon to list view
    }

    private void setListView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new StoryAdapter(this, favoriteStories, R.layout.item_vertical_view, true);
        recyclerView.setAdapter(adapter);
        isGridView = false;
        viewButton.setImageResource(R.drawable.ic_grid_view); // Set icon to grid view
    }

    private void toggleView() {
        if (isGridView) {
            setListView();
        } else {
            setGridView();
        }
    }
}
