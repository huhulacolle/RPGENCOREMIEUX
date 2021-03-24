package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MenuPrincipale extends AppCompatActivity {

    private Button NewGame;
    private Button Continue;
    private Button teste;
    Cursor test;

    private RequeteBD db = new RequeteBD(MenuPrincipale.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.NewGame = findViewById(R.id.NewGame);
        this.Continue = findViewById(R.id.Continue);

        NewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.CreationSauvegarde();
                Intent launchNG = new Intent(getApplicationContext(), LeCommencement.class);
                startActivity(launchNG);
                finish();
            }
        });
        Cursor sauvegardes = db.LireFichier();
        Log.d("STATE", String.valueOf(sauvegardes));
        if((sauvegardes != null) && sauvegardes.moveToFirst()) {
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchNG = new Intent(getApplicationContext(), SplashScreen.class);
                    startActivity(launchNG);
                    finish();
                }
            });
        }
    }
}