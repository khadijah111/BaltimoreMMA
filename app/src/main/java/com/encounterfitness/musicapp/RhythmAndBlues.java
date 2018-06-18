package com.encounterfitness.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RhythmAndBlues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an arraylist and add the Artist and Title
        ArrayList <Details> music = new ArrayList <>();
        music.add(new Details ("Ray Charles", "Early In the Morning"));
        music.add(new Details("Bettye Swann", "I'd Rather Go Blind"));
        music.add(new Details("Buddy Guy, Junior Wells", "Bad Bad Whiskey"));
        music.add(new Details("Big Joe Turner", "Tv Mama"));
        music.add(new Details("Freddie King", "Stumble"));
        music.add(new Details("Aretha Franklin", "A Song For You"));
        music.add(new Details("Little Richard", "Freedom Blues"));
        music.add(new Details("Canned Heat", "I Need Someone"));
        music.add(new Details("The Paul Butterfield Blues Band", "Born In Chicago"));
        music.add(new Details("Carla Thomas", "Red Rooster"));

        WordAdapter adapter = new WordAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
