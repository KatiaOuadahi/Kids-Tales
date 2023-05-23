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
    int defaultpage =1;
    String myPage;
    TextView title;

    static int  numPage;
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
        ViewPager viewPager = findViewById(R.id.viewPager);
        ScenesAdapter scenesAdapter=new ScenesAdapter(ScenesActivity.this,myScenes);
        viewPager.setAdapter(scenesAdapter);

        //move to the StoriesListActivity when the ib_backToStoriesList is clicked
        ImageButton backToStoriesList=findViewById(R.id.ib_backToStoriesList);
        backToStoriesList.setOnClickListener(v->{
            Intent intent = new Intent(ScenesActivity.this, StoriesListActivity.class);
            startActivity(intent);
        });

        // set the Clicking Swipe pages and change the number of the current page
        ImageButton ibPrevPage=findViewById(R.id.ib_PrevPage);
        ImageButton ibNextPage=findViewById(R.id.ib_NextPage);
        TextView pageNumberTextView=findViewById(R.id.tv_PageNumber);


        int initialPage = 0; // Set the initial page number here
        viewPager.setCurrentItem(initialPage);
        pageNumberTextView.setText("" + (initialPage + 1)); // Add 1 to display a 1-based index

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Not needed for updating the current page number dynamically
            }

            @Override
            public void onPageSelected(int position) {
                int currentPage = position + 1; // Add 1 to position to display a 1-based index
                String pageNumberText = "" + currentPage;
                pageNumberTextView.setText(pageNumberText);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // Not needed for updating the current page number dynamically
            }
        });


















        ibNextPage.setOnClickListener(v->{

            int nextPage =viewPager.getCurrentItem() + 1;
            viewPager.setCurrentItem(nextPage);
        });


        ibPrevPage.setOnClickListener(v->{
            int prevPage = viewPager.getCurrentItem() - 1;
            viewPager.setCurrentItem(prevPage);
           // currentPage.setText(String.valueOf(prevPage));
        });


    }
}