package com.encounterfitness.baltimoremma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Boxing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create an arraylist and add the Artist and Title
        ArrayList <GymDetails> music = new ArrayList <>();
        music.add(new GymDetails(R.drawable.amt,"7214 Harford Road Parkville,Maryland 21234", "American Muay Thai"));
        music.add(new GymDetails(R.drawable.baltimoreboxing, "506 ½ South Broadway Baltimore, MD 21231", "Baltimore Boxing"));
        music.add(new GymDetails("1901 Pennsylvania Ave. Baltimore, Md.  21217", "Upton Boxing Center"));
        music.add(new GymDetails("5000 Wabash Ave. Baltimore, MD 21215", "Uppercut Boxing Gym"));

        GymDetailsAdapter adapter = new GymDetailsAdapter(this, music);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
