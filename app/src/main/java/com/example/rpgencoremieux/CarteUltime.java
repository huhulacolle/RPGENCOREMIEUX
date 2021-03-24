package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CarteUltime extends AppCompatActivity {

    private RequeteBD db = new RequeteBD(CarteUltime.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre_2);
        db.Carte();

    }
}