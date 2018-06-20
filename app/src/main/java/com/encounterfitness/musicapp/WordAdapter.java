package com.encounterfitness.musicapp;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter <Details> {

    public WordAdapter(Activity context, ArrayList<Details> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and 2 ImageViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }

        // Get the song object located at this position in the list
        Details currentSong = getItem(position);

        // Find the TextView in the list_layout.xml with the titile
        TextView titleTextView = listItemView.findViewById(R.id.title_textView);
        // Get the title from the current object and set this text on the title TextView
        titleTextView.setText(currentSong.getSongTitle());

        // Find the TextView in the list_layout.xml with the artists
        TextView authorTextView = listItemView.findViewById(R.id.artist_textView);
        // Get the artist from the current object and set this text on the artist TextView
        authorTextView.setText(currentSong.getSongArtist());

        // Find the ImageView in the list_layout.xml with the ID play_button
        ImageView iconView = listItemView.findViewById(R.id.play_button);
        // Get the image from the current object and set this image on the ID play_button
        iconView.setImageResource(currentSong.getPlayButtonId());

        // Find the ImageView in the list_layout.xml layout with the ID album_cover
        ImageView iconViewB = listItemView.findViewById(R.id.album_cover);
        // Get the image from the current object and set this image on the ID album_cover
        iconViewB.setImageResource(currentSong.getAlbumCoverId());

        // Return the whole list item layout (containing 2 TextViews and 2 ImageViews) so that it can be shown in the ListView
        return listItemView;
    }
}
