package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import com.example.kidstales.adapter.ScenesAdapter;
import com.example.kidstales.adapter.StoryAdapter;
import com.example.kidstales.data.StoriesDataSource;
import com.example.kidstales.model.Scene;
import com.example.kidstales.model.Story;
import com.google.gson.Gson;

import java.util.List;

public class ScenesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenes);

        // Get the Story object passed from StoriesListActivity
        Gson gson = new Gson();
        String storyJson = getIntent().getStringExtra("Story");
        Story story = gson.fromJson(storyJson, Story.class);

        //Get the scenes
        List<Scene> myScenes = story.getScenes();



        // Set up the ViewPager to display the story's scenes
        ViewPager viewPager = findViewById(R.id.viewPager);
        ScenesAdapter scenesAdapter=new ScenesAdapter(ScenesActivity.this,myScenes);
        viewPager.setAdapter(scenesAdapter);

        //move to the StoriesListActivity when the ib_backToStoriesList is clicked
        ImageButton backToStoriesList=findViewById(R.id.ib_backToStoriesList);
        backToStoriesList.setOnClickListener(v->{
            Intent intent = new Intent(ScenesActivity.this, StoriesListActivity.class);
            startActivity(intent);
        });

    }
}