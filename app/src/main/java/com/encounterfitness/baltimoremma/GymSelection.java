package com.encounterfitness.baltimoremma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GymSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gym_selection_layout);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new GymSelectionFragment())
                .commit();
    }

}
