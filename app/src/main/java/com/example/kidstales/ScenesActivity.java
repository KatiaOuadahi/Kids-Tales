package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageButton;
import android.widget.TextView;

import com.example.kidstales.adapter.ScenesAdapter;

import com.example.kidstales.model.Scene;
import com.example.kidstales.model.Story;


import java.util.List;

public class ScenesActivity extends AppCompatActivity {
    TextView title;
    ViewPager viewPager;
    ScenesAdapter scenesAdapter;
    ImageButton ibNextPage;
    ImageButton ibPrevPage;
    TextView pageNumberTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenes);

        // Get the Story object passed from StoriesListActivity

        Story story= (Story) getIntent().getSerializableExtra("Story");


        //Get the scenes
        List<Scene> myScenes = story.getScenes();

        int mytitle = story.getTitleResourceId();
        title=findViewById(R.id.tv_title);
        title.setText(mytitle);

        // Set up the ViewPager to display the story's scenes
        viewPager = findViewById(R.id.viewPager);
        scenesAdapter=new ScenesAdapter(ScenesActivity.this,myScenes);
        viewPager.setAdapter(scenesAdapter);

        //move to the StoriesListActivity when the ib_backToStoriesList is clicked
        ImageButton backToStoriesList=findViewById(R.id.ib_backToStoriesList);
        backToStoriesList.setOnClickListener(v->{
            Intent intent = new Intent(ScenesActivity.this, StoriesListActivity.class);
            startActivity(intent);
        });


        // change the number of the current page

        pageNumberTextView=findViewById(R.id.tv_PageNumber);


        // Set the initial page number here
        int initialPage = 0;
        viewPager.setCurrentItem(initialPage);
        pageNumberTextView.setText((initialPage + 1)); // Add 1 to display a 1-based index


        // change the current page by swiping (left/right)
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageSelected(int position) {
                int currentPage = position + 1; // Add 1 to position to display a 1-based index
                String pageNumberText = "" + currentPage;
                pageNumberTextView.setText(pageNumberText);
            }

            @Override
            public void onPageScrollStateChanged(int state) {}
        });






        // change the current page by clicking on the image button  (prev/next)
        ibPrevPage=findViewById(R.id.ib_PrevPage);
        ibNextPage=findViewById(R.id.ib_NextPage);


        ibNextPage.setOnClickListener(v->{
            int nextPage =viewPager.getCurrentItem() + 1;
            viewPager.setCurrentItem(nextPage);
        });


        ibPrevPage.setOnClickListener(v->{
            int prevPage = viewPager.getCurrentItem() - 1;
            viewPager.setCurrentItem(prevPage);
        });


    }
}