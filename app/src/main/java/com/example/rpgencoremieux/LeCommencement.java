package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LeCommencement extends AppCompatActivity {

    private RequeteBD db = new RequeteBD(LeCommencement.this);

    private Button Carte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_le_commencement);
        this.Carte = findViewById(R.id.next);
        getSupportActionBar().hide();
        Cursor sauvegardes = db.LireFichier();
        if((sauvegardes != null && sauvegardes.moveToFirst())) {
            db.NouvelleSauvegarde();
        }
        else
        {
            db.CreationSauvegarde();
        }
        Carte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), CarteUltime.class);
                startActivity(launchNG);
                finish();
            }
        });
    }
}