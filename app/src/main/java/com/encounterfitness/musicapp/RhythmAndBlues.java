package com.encounterfitness.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RhythmAndBlues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create an arraylist and add the Artist and Title
        ArrayList <MusicDetails> music = new ArrayList <>();
        music.add(new MusicDetails(R.drawable.raycharles,"Ray Charles", "Early In the Morning", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.bettyswann,"Bettye Swann", "I'd Rather Go Blind", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.buddyguy,"Buddy Guy, Junior Wells", "Bad Bad Whiskey", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.joeturner,"Big Joe Turner", "Tv Mama", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.freddieking,"Freddie King", "Stumble", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.arethafranklin,"Aretha Franklin", "A Song For You", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.littlerichard,"Little Richard", "Freedom Blues", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.cannedheat,"Canned Heat", "I Need Someone", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.paulbutterfield,"The Paul Butterfield Blues Band", "Born In Chicago", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.carlathomas,"Carla Thomas", "Red Rooster", R.drawable.playbutton));

        MusicDetailsAdapter adapter = new MusicDetailsAdapter(this, music);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
