package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

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
        //Story story = getIntent().getParcelableExtra("Story");
        Gson gson = new Gson();
        String storyJson = getIntent().getStringExtra("Story");
        Story story = gson.fromJson(storyJson, Story.class);

        Log.d("MY_TAG_activity","THE SELECTED STORY IS "+story.getTitle());
        Log.d("MY_TAG_activity","THE SIZE OF THE SCENCES "+story.getScenes().size());

        List<Scene> myScenes = story.getScenes();

        Log.d("MY_TAG_activity","THE FIRST SCENE IS "+story.getScenes().get(0).getText());

        // Set up the ViewPager to display the story's scenes
        ViewPager viewPager = findViewById(R.id.viewPager);
        ScenesAdapter scenesAdapter=new ScenesAdapter(ScenesActivity.this,myScenes);
          viewPager.setAdapter(scenesAdapter);
         // viewPager.setCurrentItem(2);
    }
}