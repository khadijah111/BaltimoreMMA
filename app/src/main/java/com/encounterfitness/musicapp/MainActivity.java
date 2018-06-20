package com.encounterfitness.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the View that shows the rock and roll music list
        TextView rock = findViewById(R.id.rockTextView);

        // Set a click listener on the rock and roll View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockNRoll.class);
                startActivity(rockIntent);
            }
        });


        // Find the View that shows the country music list
        TextView country = findViewById(R.id.countryTextView);

        //Set a click listener on the country View
        country.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(MainActivity.this, Country.class);
                startActivity(countryIntent);
            }
        });

        // Find the View that shows the rhythm and blues music list
        TextView rhythmNblues = findViewById(R.id.rNbTextView);

        //Set a click listener on the rhythm and blues View
        rhythmNblues.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rNbIntent = new Intent(MainActivity.this, RhythmAndBlues.class);
                startActivity(rNbIntent);
            }
        });

        // Find the View that shows the rap music list
        TextView rap = findViewById(R.id.rapTextView);

        //Set a click listener on the rap View
        rap.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(MainActivity.this, Rap.class);
                startActivity(rapIntent);
            }
        });

        // Find the View that shows play now
        TextView playnow = findViewById(R.id.playingNowTextView);

        //Set a click listener on the play now View
        playnow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playnowwIntent = new Intent(MainActivity.this, PlayNow.class);
                startActivity(playnowwIntent);
            }
        });
    }

}
