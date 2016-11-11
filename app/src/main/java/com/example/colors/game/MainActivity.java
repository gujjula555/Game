package com.example.colors.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickRandomNumber();

    }


    public void pickRandomNumber() {
        Random random = new Random(10);
        int num1 = random.nextInt();
        int num2 = random.nextInt();
        Button b1 = (Button)findViewById(R.id.left_button);
        Button b2 = (Button)findViewById(R.id.right_button);
        b1.setText(String.valueOf(num1));
        b2.setText(String.valueOf(num2));
    }

    public void left(View view) {
        pickRandomNumber();
    }


    public void right(View view) {

        pickRandomNumber();
    }



    }



