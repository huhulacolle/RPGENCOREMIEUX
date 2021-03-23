package com.example.rpgencoremieux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {

    private Bd db = new Bd(SplashScreen.this);

    private Button Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        MediaPlayer player = MediaPlayer.create(this, R.raw.snk);
        //MediaPlayer player = MediaPlayer.create(this, R.raw.snk);
        player.setLooping(true);
        player.start();
        this.Start = findViewById(R.id.start);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchNG = new Intent(getApplicationContext(), MenuPrincipale.class);
                startActivity(launchNG);
                finish();
            }
        });
    }
}