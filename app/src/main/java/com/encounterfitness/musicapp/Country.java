package com.encounterfitness.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Country extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create an arraylist and add the Artist and Title
        ArrayList <Details> music = new ArrayList <>();
        music.add(new Details (R.drawable.garthbrooks,"Garth Brooks", "Friends In Low Places", R.drawable.playbutton));
        music.add(new Details(R.drawable.railroad,"Confederate Railroad", "Trashy Women", R.drawable.playbutton));
        music.add(new Details(R.drawable.johnmichael,"John Michael Montgomery", "Sold (The Grundy County Auction Incident)", R.drawable.playbutton));
        music.add(new Details(R.drawable.kennyroger,"Kenny Rogers", "The Gambler", R.drawable.playbutton));
        music.add(new Details(R.drawable.clintblack,"Clint Black", "A Better Man", R.drawable.playbutton));
        music.add(new Details(R.drawable.alanjackson,"Alan Jackson", "Gone Country", R.drawable.playbutton));
        music.add(new Details(R.drawable.brooksanddunn,"Brooks and Dunn", "Neon Moon", R.drawable.playbutton));
        music.add(new Details(R.drawable.timmcgraw,"Tim McGraw", "Where The Green Grass Grows", R.drawable.playbutton));
        music.add(new Details(R.drawable.kennychesney,"Kenny Chesney", "She's Got It All", R.drawable.playbutton));
        music.add(new Details(R.drawable.rebamcentire,"Reba McEntire", "Fancy", R.drawable.playbutton));

        WordAdapter adapter = new WordAdapter(this, music);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
