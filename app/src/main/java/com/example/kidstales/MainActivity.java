package com.example.kidstales;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button showAll = findViewById(R.id.btn_show_all);


        //move to StoriesListActiviy when the btn_show_all button is clicked
        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StoriesListActivity.class);
                startActivity(intent);
            }
        });



        Button showFavorites = findViewById(R.id.btn_show_favorites);


        //move to StoriesListActiviy when the btn_show_all button is clicked
        showFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(intent);
            }
        });




    }
}