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
        ArrayList <MusicDetails> music = new ArrayList <>();
        music.add(new MusicDetails(R.drawable.garthbrooks,"Garth Brooks", "Friends In Low Places", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.railroad,"Confederate Railroad", "Trashy Women", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.johnmichael,"John Michael Montgomery", "Sold (The Grundy County Auction Incident)", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.kennyroger,"Kenny Rogers", "The Gambler", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.clintblack,"Clint Black", "A Better Man", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.alanjackson,"Alan Jackson", "Gone Country", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.brooksanddunn,"Brooks and Dunn", "Neon Moon", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.timmcgraw,"Tim McGraw", "Where The Green Grass Grows", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.kennychesney,"Kenny Chesney", "She's Got It All", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.rebamcentire,"Reba McEntire", "Fancy", R.drawable.playbutton));

        MusicDetailsAdapter adapter = new MusicDetailsAdapter(this, music);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
