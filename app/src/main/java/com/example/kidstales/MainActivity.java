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


        Button showAll = findViewById(R.id.btn_show_all);


        // déplacer vers StoriesListActiviy lorsque le bouton btn_show_all est cliqué
        showAll.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StoriesListActivity.class);
            startActivity(intent);
        });


    }
}