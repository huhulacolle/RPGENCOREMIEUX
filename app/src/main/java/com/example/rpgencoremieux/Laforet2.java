package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Laforet2 extends AppCompatActivity {
    private RequeteBD db = new RequeteBD(Laforet2.this);
    private Button Gauche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laforet2);
        this.Gauche = findViewById(R.id.next6);
        getSupportActionBar().hide();
        db.Foret2();
        Gauche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), Laforet2.class);
                startActivity(launchNG);
                finish();
            }
        });
    }
}