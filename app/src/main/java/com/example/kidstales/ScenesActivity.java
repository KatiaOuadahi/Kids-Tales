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

        // Récupérer l'objet Story passé depuis StoriesListActivity
        Story story = (Story) getIntent().getSerializableExtra("Story");

        // Récupérer les scènes
        List<Scene> mesScenes = story.getScenes();

        int monTitre = story.getTitleResourceId();
        title = findViewById(R.id.tv_title);
        title.setText(monTitre);

        // Configurer le ViewPager pour afficher les scènes de l'histoire
        viewPager = findViewById(R.id.viewPager);
        scenesAdapter = new ScenesAdapter(ScenesActivity.this, mesScenes);
        viewPager.setAdapter(scenesAdapter);

        // Revenir à StoriesListActivity lorsque le bouton ib_backToStoriesList est cliqué
        ImageButton backToStoriesList = findViewById(R.id.ib_backToStoriesList);
        backToStoriesList.setOnClickListener(v -> {
            Intent intent = new Intent(ScenesActivity.this, StoriesListActivity.class);
            startActivity(intent);
        });

        // Changer le numéro de la page actuelle
        pageNumberTextView = findViewById(R.id.tv_PageNumber);

        // Définir le numéro de page initial ici
        int pageInitiale = 0;
        viewPager.setCurrentItem(pageInitiale);
        pageNumberTextView.setText(String.valueOf(pageInitiale + 1)); // Ajouter 1 pour afficher un index basé sur 1

        // Changer de page en faisant glisser (gauche/droite)
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                int pageCourante = position + 1; // Ajouter 1 à la position pour afficher un index basé sur 1
                String texteNumeroPage = "" + pageCourante;
                pageNumberTextView.setText(texteNumeroPage);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        // Changer de page en cliquant sur le bouton image (précédent/suivant)
        ibPrevPage = findViewById(R.id.ib_PrevPage);
        ibNextPage = findViewById(R.id.ib_NextPage);

        ibNextPage.setOnClickListener(v -> {
            int pageSuivante = viewPager.getCurrentItem() + 1;
            viewPager.setCurrentItem(pageSuivante);
        });

        ibPrevPage.setOnClickListener(v -> {
            int pagePrecedente = viewPager.getCurrentItem() - 1;
            viewPager.setCurrentItem(pagePrecedente);
        });
    }
}
