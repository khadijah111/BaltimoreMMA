package com.encounterfitness.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockNRoll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create an arraylist and add the Artist and Title
        ArrayList <Details> music = new ArrayList <>();
        music.add(new Details (R.drawable.metallica,"Metallica", "Enter Sandman", R.drawable.playbutton));
        music.add(new Details(R.drawable.godsmack,"Godsmack", "Voodoo", R.drawable.playbutton));
        music.add(new Details(R.drawable.drowningpool,"Drowning Pool", "Sinner", R.drawable.playbutton));
        music.add(new Details(R.drawable.imaginedragons,"Imagine Dragons", "Radioactive", R.drawable.playbutton));
        music.add(new Details(R.drawable.blur,"Blur", "Song 2", R.drawable.playbutton));
        music.add(new Details(R.drawable.fivefingerdeathpunch,"Five Finger Death Punch", "Bad Company", R.drawable.playbutton));
        music.add(new Details(R.drawable.volbeat,"Volbeat", "A Warrior's Call", R.drawable.playbutton));
        music.add(new Details(R.drawable.gunsandroses,"Guns N' Roses", "Welcome To The Jungle", R.drawable.playbutton));
        music.add(new Details(R.drawable.chevelle,"Chevelle", "The Red", R.drawable.playbutton));
        music.add(new Details(R.drawable.nickelback,"Nickleback", "This Means War", R.drawable.playbutton));

        WordAdapter adapter = new WordAdapter(this, music);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
