package com.encounterfitness.baltimoremma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuayThai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create an arraylist and add the Artist and Title
        ArrayList <GymDetails> music = new ArrayList <>();
        music.add(new GymDetails(R.drawable.ericb,"7214 Harford Road Parkville,Maryland 21234", "American Muay Thai"));
        music.add(new GymDetails(R.drawable.twochainz,"3000 Chestnut Ave, Baltimore, MD 21211", "Elite Kickfight"));
        music.add(new GymDetails(R.drawable.kanye,"4891 Tesla Dr, STE E-G, Bowie, MD 20715", "LevelUp"));
        music.add(new GymDetails(R.drawable.lilbaby,"8101 Pulaski Hwy Baltimore, MD 21237", "Ground Control"));

        GymDetailsAdapter adapter = new GymDetailsAdapter(this, music);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
