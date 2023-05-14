package com.example.kidstales;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories_list);

        recyclerView = findViewById(R.id.grid_recycler_view);
        viewButton = findViewById(R.id.ib_view);
        viewButton.setOnClickListener(v -> toggleView());

        setGridView(); // Set initial view as grid view


        ImageButton showFavorites = findViewById(R.id.ib_ShowFavorites);
        //move to StoriesListActiviy when the btn_show_all button is clicked
        showFavorites.setOnClickListener(v -> {
            Intent intent = new Intent(StoriesListActivity.this, FavoritesActivity.class);
            startActivity(intent);
        });

        ImageButton backToMain = findViewById(R.id.ib_backToMain);
        //move to mainActivity when ib_backToMain is clicked
        backToMain.setOnClickListener(v -> {
            Intent intent = new Intent(StoriesListActivity.this, MainActivity.class);
            startActivity(intent);
        });


    }

    private void setGridView() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        StoryAdapter adapter = new StoryAdapter(this, StoriesDataSource.getStories(), R.layout.item_grid_view, false);
        recyclerView.setAdapter(adapter);
        isGridView = true;
        viewButton.setImageResource(R.drawable.ic_list_view); // Set icon to list view
    }

    private void setListView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        StoryAdapter adapter = new StoryAdapter(this, StoriesDataSource.getStories(), R.layout.item_vertical_view, false);
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