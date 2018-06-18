package com.encounterfitness.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Rap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an arraylist and add the Artist and Title
        ArrayList <Details> music = new ArrayList <>();
        music.add(new Details ("Eric B. & Rakim", "Don't Sweat The Technique"));
        music.add(new Details("2 Chains", "Bigger Than You"));
        music.add(new Details("Kanye West", "All Mine"));
        music.add(new Details("Lil Baby", "Yes Indeed"));
        music.add(new Details("Drake", "I'm Upset"));
        music.add(new Details("Nicki Minaj", "Rich Sex"));
        music.add(new Details("Jay Rock", "WIN"));
        music.add(new Details("G-Eazy", "1942"));
        music.add(new Details("Travis Scott", "Watch"));
        music.add(new Details("Ty Dolla $ign", "Clout"));

        WordAdapter adapter = new WordAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
