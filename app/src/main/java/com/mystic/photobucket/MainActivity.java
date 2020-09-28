package com.mystic.photobucket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView first ,second,third,fourth,fifth,six,seven,eight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewDeclare();
        reactToClick();
    }

    public void viewDeclare(){
        first = findViewById(R.id.firstRed);
        second = findViewById(R.id.secondBlue);
        third = findViewById(R.id.thirdGreen);
        fourth = findViewById(R.id.fourthOrange);
        fifth = findViewById(R.id.fifthViolet);
        six = findViewById(R.id.sixthYellow);
        seven = findViewById(R.id.seventhOlive);
        eight = findViewById(R.id.eightCyan);
    }

    public void reactToClick(){


        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_MESSAGE,
                        "Red is the color at the end of the visible spectrum of light, next to orange and opposite violet." +
                        "It has a dominant wavelength of approximately 625–740 nanometres");
                intent.putExtra(SecondActivity.COLOR,getResources().getColor(R.color.red));
                intent.putExtra(SecondActivity.ADDRESS,"https://en.wikipedia.org/wiki/Red");
                startActivity(intent);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_MESSAGE,
                        "Blue is one of the three primary colours of pigments in painting and traditional colour theory, as well as in the RGB colour model." +
                                " It lies between violet and green on the spectrum of visible light");
                intent.putExtra(SecondActivity.COLOR,getResources().getColor(R.color.blue));
                intent.putExtra(SecondActivity.ADDRESS,"https://en.wikipedia.org/wiki/Blue");
                startActivity(intent);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_MESSAGE,
                        "Green is the color between blue and yellow on the visible spectrum." +
                                " It is evoked by light which has a dominant wavelength of roughly 495–570 nm");
                intent.putExtra(SecondActivity.COLOR,getResources().getColor(R.color.green));
                intent.putExtra(SecondActivity.ADDRESS,"https://en.wikipedia.org/wiki/Green");
                startActivity(intent);
            }
        });

        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_MESSAGE,
                        "The orange is the fruit of various citrus species in the family Rutaceae (see list of plants known as orange);" +
                                " it primarily refers to Citrus × sinensis, which is also called sweet orange, to distinguish" +
                                " it from the related Citrus × aurantium, referred to as bitter orange");
                intent.putExtra(SecondActivity.COLOR,getResources().getColor(R.color.orange));
                intent.putExtra(SecondActivity.ADDRESS,"https://en.wikipedia.org/wiki/Orange_(colour)");
                startActivity(intent);
            }
        });

        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_MESSAGE,
                        "Violet is the color of light at the short wavelength end of the visible spectrum, between blue and invisible ultraviolet." +
                                " It is one of the seven colors that Isaac Newton labeled when dividing the spectrum of visible light in 1672");
                intent.putExtra(SecondActivity.COLOR,getResources().getColor(R.color.violet));
                intent.putExtra(SecondActivity.ADDRESS,"https://en.wikipedia.org/wiki/Violet_(color)");
                startActivity(intent);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_MESSAGE,
                        "Yellow is the color between orange and green on the spectrum of visible light." +
                                " It is evoked by light with a dominant wavelength of roughly 570–590 nm." +
                                " It is a primary color in subtractive color systems, used in painting or color printing");
                intent.putExtra(SecondActivity.COLOR,getResources().getColor(R.color.yellow));
                intent.putExtra(SecondActivity.ADDRESS,"https://en.wikipedia.org/wiki/Yellow");
                startActivity(intent);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_MESSAGE,
                        "In color theory, purple colors are any colors on the line of purples on the CIE chromaticity " +
                                "diagram (or colors that can be derived from colors on the line of purples), i.e.," +
                                " any color between red and violet, not including either red or violet themselves.");
                intent.putExtra(SecondActivity.COLOR,getResources().getColor(R.color.purple));
                intent.putExtra(SecondActivity.ADDRESS,"https://en.wikipedia.org/wiki/Shades_of_purple");
                startActivity(intent);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_MESSAGE,
                        "Cyan is a greenish-blue color." +
                                " It is evoked by light with a predominant wavelength of between 490 and 520 nm, between the wavelengths of green and blue.");
                intent.putExtra(SecondActivity.COLOR,getResources().getColor(R.color.cyan));
                intent.putExtra(SecondActivity.ADDRESS,"https://en.wikipedia.org/wiki/Cyan");
                startActivity(intent);
            }
        });

    }






}