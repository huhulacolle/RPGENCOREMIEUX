package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipale extends AppCompatActivity {

    private Button NewGame;
    private Button Continue;

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

        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), ListeFichier.class);
                startActivity(launchNG);
                finish();
            }
        });
    }
}