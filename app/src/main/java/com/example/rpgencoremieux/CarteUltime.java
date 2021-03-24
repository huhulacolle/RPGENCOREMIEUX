package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarteUltime extends AppCompatActivity {

    private RequeteBD db = new RequeteBD(CarteUltime.this);
    private Button Foret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre_2);
        db.Carte();
        this.Foret = findViewById(R.id.next3);
        getSupportActionBar().hide();
        Foret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), Laforet.class);
                startActivity(launchNG);
                finish();
            }
        });

    }
}