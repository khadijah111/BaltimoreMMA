package com.encounterfitness.baltimoremma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuayThai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gym_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MuayThaiFragment())
                .commit();
    }
}
