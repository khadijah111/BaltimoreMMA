package com.encounterfitness.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Rap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create an arraylist and add the Artist and Title
        ArrayList <MusicDetails> music = new ArrayList <>();
        music.add(new MusicDetails(R.drawable.ericb,"Eric B. & Rakim", "Don't Sweat The Technique", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.twochainz,"2 Chains", "Bigger Than You", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.kanye,"Kanye West", "All Mine", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.lilbaby,"Lil Baby", "Yes Indeed", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.drake,"Drake", "I'm Upset", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.nickiminaj,"Nicki Minaj", "Rich Sex", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.jayrock,"Jay Rock", "WIN", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.geazy,"G-Eazy", "1942", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.travisscott,"Travis Scott", "Watch", R.drawable.playbutton));
        music.add(new MusicDetails(R.drawable.tydollasign,"Ty Dolla $ign", "Clout", R.drawable.playbutton));

        MusicDetailsAdapter adapter = new MusicDetailsAdapter(this, music);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
