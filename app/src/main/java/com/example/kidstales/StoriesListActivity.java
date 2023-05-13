package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.kidstales.adapter.StoryAdapter;
import com.example.kidstales.data.StoriesDataSource;
import com.example.kidstales.model.Story;
import com.example.kidstales.utils.FavoritesManager;

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




        ImageButton showFavorites = findViewById(R.id.ib_ShowFavorites);


        //move to StoriesListActiviy when the btn_show_all button is clicked
        showFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoriesListActivity.this, FavoritesActivity.class);
                startActivity(intent);
            }
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