package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.kidstales.model.Story;

public class ScenesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenes);

        // Get the Story object passed from MainActivity
        Story story = (Story) getIntent().getSerializableExtra("Story");

        // Set up the ViewPager to display the story's scenes
        ViewPager viewPager = findViewById(R.id.viewPager);
    }
}