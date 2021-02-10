package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeCommencement extends AppCompatActivity {

    private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Next = findViewById(R.id.NewAdventure);

         Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LaunchNext = new Intent(getApplicationContext(), Debutfullscreen.class);
                startActivity(LaunchNext);
                finish();
            }
        });
    }
}