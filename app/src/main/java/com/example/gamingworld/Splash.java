package com.example.gamingworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {
    Intent splash; //intent create

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //connect xml to java
        setContentView(R.layout.activity_splash);

        //connect splash to mainActivity
        splash = new Intent(Splash.this , MainActivity.class);

        //Delay function calling
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(splash);
                finish();
            }
        } ,2000);

    }
}