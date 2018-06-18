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
        TextView rock = (TextView) findViewById(R.id.rockTextView);

        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockNRoll.class);
                startActivity(rockIntent);
            }
        });


        // Find the View that shows the country music list
        TextView country = (TextView) findViewById(R.id.countryTextView);

        country.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(MainActivity.this, Country.class);
                startActivity(countryIntent);
            }
        });

        // Find the View that shows the rhythm and blues music list
        TextView rhythmNblues = (TextView) findViewById(R.id.rNbTextView);

        rhythmNblues.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rNbIntent = new Intent(MainActivity.this, RhythmAndBlues.class);
                startActivity(rNbIntent);
            }
        });


        // Find the View that shows the rap music list
        TextView rap = (TextView) findViewById(R.id.rapTextView);

        rap.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(MainActivity.this, Rap.class);
                startActivity(rapIntent);
            }
        });
    }

}
