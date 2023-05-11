package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kidstales.adapter.StoryAdapter;
import com.example.kidstales.data.DataSource;




public class StoriesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories_list);

        RecyclerView recyclerView = findViewById(R.id.grid_recycler_view);

        StoryAdapter adapter = new StoryAdapter(this, DataSource.getStories());



        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }

}
