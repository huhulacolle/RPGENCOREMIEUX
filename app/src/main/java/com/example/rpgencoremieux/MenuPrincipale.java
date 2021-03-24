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
                Intent launchNG = new Intent(getApplicationContext(), LeCommencement.class);
                startActivity(launchNG);
                finish();
            }
        });
        Cursor sauvegardes = db.LireFichier();
        if((sauvegardes != null && sauvegardes.moveToFirst())) {
            int niveau = sauvegardes.getInt(sauvegardes.getColumnIndex("Level"));
//            niveau = [inserer num] pour le debug
            Log.d("Sauvegarde ", String.valueOf(niveau));
            switch (niveau){
                case 1:
                    Continue.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent launchNG = new Intent(getApplicationContext(), LeCommencement.class);
                            startActivity(launchNG);
                            finish();
                        }
                    });
                    break;
                case 2:
                    Continue.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent launchNG = new Intent(getApplicationContext(), CarteUltime.class);
                            startActivity(launchNG);
                            finish();
                        }
                    });
                    break;
                default:

                    break;
            }

        }
    }
}