package com.encounterfitness.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Country extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an arraylist and add the Artist and Title
        ArrayList <Details> music = new ArrayList <>();
        music.add(new Details ("Garth Brooks", "Friends In Low Places"));
        music.add(new Details("Confederate Railroad", "Trashy Women"));
        music.add(new Details("John Michael Montgomery", "Sold (The Grundy County Auction Incident)"));
        music.add(new Details("Kenny Rogers", "The Gambler"));
        music.add(new Details("Clint Black", "A Better Man"));
        music.add(new Details("Alan Jackson", "Gone Country"));
        music.add(new Details("Brooks and Dunn", "Neon Moon"));
        music.add(new Details("Tim McGraw", "Where The Green Grass Grows"));
        music.add(new Details("Kenny Chesney", "She's Got It All"));
        music.add(new Details("Reba McEntire", "Fancy"));

        WordAdapter adapter = new WordAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
