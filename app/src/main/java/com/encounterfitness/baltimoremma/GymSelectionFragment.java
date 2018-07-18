package com.encounterfitness.baltimoremma;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.view.ViewPager;


/**
 * A simple {@link Fragment} subclass.
 */
public class GymSelectionFragment extends Fragment {


    public GymSelectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.gym_selection_layout, container, false);

        // Find the View that shows the boxing list
        TextView boxing = rootView.findViewById(R.id.boxingTextView);

        // Set a click listener on the boxing View
        boxing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent boxingIntent = new Intent(GymSelection.this, Boxing.class);
                startActivity(boxingIntent);
            }
        });


        // Find the View that shows the bjj list
        TextView bjj = rootView.findViewById(R.id.bjjTextView);

        //Set a click listener on the bjj View
        bjj.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent bjjIntent = new Intent(GymSelection.this, BrazilianJiuJitsu.class);
                //Intent bjjIntent = new Intent(getActivity(), BrazilianJiuJitsu.class);
                startActivity(bjjIntent);
            }
        });

        // Find the View that shows the kid friendly list
        TextView kids = rootView.findViewById(R.id.kidsTextView);

        //Set a click listener on the kid friendly View
        kids.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent kidsIntent = new Intent(GymSelection.this, KidFriendly.class);
               //Intent kidsIntent = new Intent(getActivity(), KidFriendly.class);

                startActivity(kidsIntent);
            }
        });

        // Find the View that shows the muay thai list
        TextView muaythai = rootView.findViewById(R.id.muaythaiTextView);

        //Set a click listener on the muay thai View
        muaythai.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent muaythaiIntent = new Intent(GymSelection.this, MuayThai.class);
                //Intent muaythaiIntent = new Intent(getActivity(), MuayThai.class);

                startActivity(muaythaiIntent);
            }
        });
        return rootView;

    }

}
