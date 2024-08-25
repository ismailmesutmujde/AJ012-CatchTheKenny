package com.ismailmesutmujde.catchthekenny;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView timeText;
    TextView scoreText;
    int score;

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    ImageView imageView18;
    ImageView imageView19;
    ImageView imageView20;
    ImageView imageView21;
    ImageView imageView22;
    ImageView imageView23;
    ImageView imageView24;
    ImageView imageView25;

    ImageView[] imageArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize
        timeText = (TextView) findViewById(R.id.timeText);
        scoreText = (TextView) findViewById(R.id.scoreText);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);
        imageView24 = findViewById(R.id.imageView24);
        imageView25 = findViewById(R.id.imageView25);

        imageArray = new ImageView[] {imageView, imageView2, imageView3, imageView4, imageView5,
                imageView6, imageView7, imageView8, imageView9, imageView10,
                imageView11, imageView12, imageView13, imageView14, imageView15,
                imageView16, imageView17, imageView18, imageView19, imageView20,
                imageView21, imageView22, imageView23, imageView24, imageView25};

        hideImages();

        score = 0;

        new CountDownTimer(60000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                timeText.setText("Time : " + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {

            }
        }.start();

    }

    public void increaseScore(View view) {
        score++;  // score = score + 1;
        scoreText.setText("Score : " + score);
    }

    public void hideImages() {
        for (ImageView image : imageArray) {
            image.setVisibility(View.INVISIBLE);
        }
    }
}