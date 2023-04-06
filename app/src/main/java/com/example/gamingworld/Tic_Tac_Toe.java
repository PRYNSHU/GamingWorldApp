package com.example.gamingworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tic_Tac_Toe extends AppCompatActivity {
    //declaration
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, resetbtn; //buttons
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;  //where data will store
    int count = 0;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        ids();
    }

    //ids of all btns
    public void ids() {
        resetbtn = findViewById(R.id.resetbtn);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    //this function will execute when we click on that button
    public void checkbtn(View b) {

        Button buttons = (Button) b;
        if (buttons.getText().toString().equals("")) { //if button equals to empty only than execute
            count++;

            //one time x and every second O will set
            if (flag == 0) {
                buttons.setText("X");
                flag = 1;
            } else if (flag == 1) {
                buttons.setText("O");
                flag = 0;
            }

            //logic part
            if(count >4){
                btnvalue();

                //conditions
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //1
                    Toast.makeText(this, "WINNER IS " + b1, Toast.LENGTH_SHORT).show();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    //2
                    Toast.makeText(this, "WINNER IS " + b4, Toast.LENGTH_SHORT).show();

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    //3
                    Toast.makeText(this, "WINNER IS " + b7, Toast.LENGTH_SHORT).show();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    //4
                    Toast.makeText(this, "WINNER IS " + b1, Toast.LENGTH_SHORT).show();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    //5
                    Toast.makeText(this, "WINNER IS " + b2, Toast.LENGTH_SHORT).show();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    //6
                    Toast.makeText(this, "WINNER IS " + b3, Toast.LENGTH_SHORT).show();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    //7
                    Toast.makeText(this, "WINNER IS " + b1, Toast.LENGTH_SHORT).show();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    //8
                    Toast.makeText(this, "WINNER IS " + b3, Toast.LENGTH_SHORT).show();
                }else if(count ==9){
                    Toast.makeText(this, "MATCH HAS DRAWN", Toast.LENGTH_SHORT).show();
                }
            } //logic part code ends
        }
    }
    //btnvalue will store to b1,... as a string variables
    public void btnvalue(){
        b1 = btn1.getText().toString();
        b2 = btn2.getText().toString();
        b3 = btn3.getText().toString();
        b4 = btn4.getText().toString();
        b5 = btn5.getText().toString();
        b6 = btn6.getText().toString();
        b7 = btn7.getText().toString();
        b8 = btn8.getText().toString();
        b9 = btn9.getText().toString();
    }
    //checkbtn2 for reset purpose
    public void resetbtn(View v){
        Button button2 = (Button) v;
        count =0;
        flag =0;

        //reset commands
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }
}

