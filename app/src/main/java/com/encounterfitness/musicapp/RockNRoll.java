package com.encounterfitness.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockNRoll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an arraylist and add the Artist and Title
        ArrayList <Details> music = new ArrayList <>();
        music.add(new Details ("Metallica", "Enter Sandman"));
        music.add(new Details("Godsmack", "Voodoo"));
        music.add(new Details("Drowning Pool", "Sinner"));
        music.add(new Details("Imagine Dragons", "Radioactive"));
        music.add(new Details("Blur", "Song 2"));
        music.add(new Details("Five Finger Death Punch", "Bad Company"));
        music.add(new Details("Volbeat", "A Warrior's Call"));
        music.add(new Details("Guns N' Roses", "Welcome To The Jungle"));
        music.add(new Details("Chevelle", "The Red"));
        music.add(new Details("Nickleback", "This Means War"));

        WordAdapter adapter = new WordAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
