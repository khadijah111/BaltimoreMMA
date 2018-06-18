package com.encounterfitness.musicapp;

public class Details {
    //Default translation string for the word
    private String mSongTitle;

    //Miwok translation string for the word
    private String mSongArtist;

    //Create a new Word object
    public Details(String songArtist, String songTitle){
        mSongTitle = songTitle;
        mSongArtist = songArtist;
    }

    //Get the default translation of the word
    public String getSongTitle(){
        return mSongTitle;
    }

    //Get the Miwok translation of the word

    public String getSongArtist() {
        return mSongArtist;
    }
}
