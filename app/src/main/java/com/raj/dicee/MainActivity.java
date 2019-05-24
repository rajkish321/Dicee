package com.raj.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final int[] diceImages = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6


        };

        Button rollButton = findViewById(R.id.rollButton);

        final ImageView left = findViewById(R.id.image_leftDice);
        final ImageView right = findViewById(R.id.image_rightDice);
        final TextView total = findViewById(R.id.total);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Button has been pressed");

                Random rand = new Random();
                int numberLeft = rand.nextInt(6);
                int numberRight = rand.nextInt(6);
                left.setImageResource(diceImages[numberLeft]);
                right.setImageResource(diceImages[numberRight]);
                int sum = numberLeft + numberRight + 2;
                total.setText("" + sum);


            }
        });
    }
}
