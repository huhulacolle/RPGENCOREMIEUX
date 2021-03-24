package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Laforet extends AppCompatActivity {

    private Button Droite;
    private Button Gauche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laforet);
        this.Gauche = findViewById(R.id.next5);
        getSupportActionBar().hide();
        Gauche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), Laforet2.class);
                startActivity(launchNG);
                finish();
            }
        });
        this.Droite = findViewById(R.id.next4);
        getSupportActionBar().hide();
        Droite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), Laforet2.class);
                startActivity(launchNG);
                finish();
            }
        });
    }
}