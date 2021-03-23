package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ListeFichier extends AppCompatActivity {

//    RequeteBD db;
//    ArrayList<String> joueur;
    private Button Return;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_fichier);
        this.Return = findViewById(R.id.Return);

        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), MenuPrincipale.class);
                startActivity(launchNG);
                finish();
            }
        });

//        db = new RequeteBD(ListeFichier.this);
//        joueur = new ArrayList<>();
    }

//    void AfficheFichier()
//    {
//        Cursor cursor = db.LireFichier();
//        if (cursor.getCount() == 0)
//        {
//            Toast.makeText(this, "Aucun Fichier", Toast.LENGTH_SHORT.show());
//        }
//        else
//        {
//            while (cursor.moveToNext())
//                joueur.add(cursor.getString(0));
//        }
//    }
}