package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.kidstales.adapter.StoryAdapter;
import com.example.kidstales.data.StoriesDataSource;
import com.example.kidstales.model.Story;

import java.util.ArrayList;
import java.util.List;


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
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleView();
            }
        });

        setGridView(); // Set initial view as grid view





        // Inside the onCreate method of StoriesListActivity
        ImageButton ibShowFavorites = findViewById(R.id.ibShowFavorites);
        ibShowFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a separate list to hold the favorite stories
                List<Story> favoriteStories = new ArrayList<>();

                // Filter the stories based on the isFavorite field
                for (Story story : StoriesDataSource.getStories()) {
                    if (story.isFavorite()) {
                        favoriteStories.add(story);
                    }
                }

                // Update the RecyclerView's adapter with the filtered list
                StoryAdapter adapter = new StoryAdapter(StoriesListActivity.this, favoriteStories, R.layout.item_grid_view);
                recyclerView.setAdapter(adapter);
            }
        });





    }

    private void setGridView() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        StoryAdapter adapter = new StoryAdapter(this, StoriesDataSource.getStories(), R.layout.item_grid_view);
        recyclerView.setAdapter(adapter);
        isGridView = true;
        viewButton.setImageResource(R.drawable.ic_list_view); // Set icon to list view
    }

    private void setListView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        StoryAdapter adapter = new StoryAdapter(this, StoriesDataSource.getStories(), R.layout.item_vertical_view);
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
