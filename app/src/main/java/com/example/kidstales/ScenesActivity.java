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


        /// Obtenir l'objet Story transmis depuis StoriesListActivity
        Story story= (Story) getIntent().getSerializableExtra("Story");


        // Obtenir les scènes
        List<Scene> myScenes = story.getScenes();

        int storyTitle = story.getTitleResourceId();
        title=findViewById(R.id.tv_title);
        title.setText(storyTitle);


        // Configurer le ViewPager pour afficher les scènes de l'histoire
        viewPager = findViewById(R.id.viewPager);
        scenesAdapter=new ScenesAdapter(ScenesActivity.this,myScenes);
        viewPager.setAdapter(scenesAdapter);


        // Revenir à StoriesListActivity lorsque ib_backToStoriesList est cliqué
        ImageButton backToStoriesList=findViewById(R.id.ib_backToStoriesList);
        backToStoriesList.setOnClickListener(v->{
            Intent intent = new Intent(ScenesActivity.this, StoriesListActivity.class);
            startActivity(intent);
        });



        // Changer le numéro de la page actuelle
        pageNumberTextView=findViewById(R.id.tv_PageNumber);


        // Définir le numéro de page initial ici
        int initialPage = 0;
        viewPager.setCurrentItem(initialPage);
        pageNumberTextView.setText(String.valueOf(initialPage + 1)); // Ajouter 1 pour afficher un index basé sur 1


        // Changer la page actuelle en faisant glisser (gauche/droite)
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageSelected(int position) {
                int currentPage = position + 1; // Ajouter 1 à la position pour afficher un index basé sur 1
                String pageNumberText = "" + currentPage;
                pageNumberTextView.setText(pageNumberText);
            }

            @Override
            public void onPageScrollStateChanged(int state) {}
        });






        // Changer la page actuelle en cliquant sur le bouton image (précédent/suivant)
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