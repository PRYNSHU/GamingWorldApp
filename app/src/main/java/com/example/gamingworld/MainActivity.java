package com.example.gamingworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent tictac;
    Button startbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //only connection established
        tictac = new Intent(this , Tic_Tac_Toe.class);
        startbtn = findViewById(R.id.startbtn);

        startbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //navigation to tictac activity
                startActivity(tictac);
            }
        });
    }
}