package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipale extends AppCompatActivity {

    private Button NewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.NewGame = findViewById(R.id.NewGame);

        NewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), Debut.class);
                startActivity(launchNG);
                finish();
            }
        });
    }
}