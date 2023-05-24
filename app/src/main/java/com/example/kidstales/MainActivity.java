package com.example.kidstales;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recherche du bouton dans la vue
        Button showAll = findViewById(R.id.btn_show_all);

        // Définition du comportement lors du clic sur le bouton
        showAll.setOnClickListener(v -> {
            // Création de l'intention de passer à l'activité StoriesListActivity
            Intent intent = new Intent(MainActivity.this, StoriesListActivity.class);
            // Démarrage de l'activité StoriesListActivity
            startActivity(intent);
        });
    }
}
