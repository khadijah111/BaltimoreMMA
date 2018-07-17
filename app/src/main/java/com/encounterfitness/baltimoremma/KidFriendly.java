package com.encounterfitness.baltimoremma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KidFriendly extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create an arraylist and add the Artist and Title
        ArrayList <GymDetails> music = new ArrayList <>();
        music.add(new GymDetails("412 Eastern Blvd, Essex, MD 21221", "Baltimore Brazilian Jiu Jitsu"));
        music.add(new GymDetails("4130-4132 E Joppa Road, Suite #112 Perry Hall, MD 21236", "GAMA"));
        music.add(new GymDetails(R.drawable.amt,"7214 Harford Road Parkville,Maryland 21234", "American Muay Thai"));
        music.add(new GymDetails("8101 Pulaski Hwy Baltimore, MD 21237", "Ground Control"));

        GymDetailsAdapter adapter = new GymDetailsAdapter(this, music);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
