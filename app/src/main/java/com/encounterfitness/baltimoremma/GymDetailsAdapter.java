package com.encounterfitness.baltimoremma;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GymDetailsAdapter extends ArrayAdapter <GymDetails> {

    public GymDetailsAdapter(Activity context, ArrayList<GymDetails> gym) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and 1 possible ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, gym);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }

        // Get the gym object located at this position in the list
        GymDetails currentGym = getItem(position);

        // Find the TextView in the list_layout.xml with the gym name
        TextView gymnameTextView = listItemView.findViewById(R.id.gymname_textView);
        // Get the gym name from the current object and set this text on the gym name TextView
        gymnameTextView.setText(currentGym.getmGymName());

        // Find the TextView in the list_layout.xml with the gym address
        TextView gymaddressTextView = listItemView.findViewById(R.id.gymaddress_textView);
        // Get the address from the current object and set this text on the gym address TextView
        gymaddressTextView.setText(currentGym.getmGymAddress());

        // Find the ImageView in the list_layout.xml layout with the ID gympic
        ImageView gympic = listItemView.findViewById(R.id.gympic_imageview);
        // Get the image from the current object and set this image on the ID album_cover
        gympic.setImageResource(currentGym.getmGymImageId());

        // Return the whole list item layout (containing 2 TextViews and 1 possible ImageView) so that it can be shown in the ListView
        return listItemView;
    }
}
