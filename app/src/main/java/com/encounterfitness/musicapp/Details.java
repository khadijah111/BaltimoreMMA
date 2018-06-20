package com.encounterfitness.musicapp;

public class Details {
    //Title of the song
    private String mSongTitle;

    //Artist of the song
    private String mSongArtist;

    // Play button image ID
    private int mPlaybuttonId;

    //Album Cover image ID
    private int mAlbumCoverId;

    //Create a new song item
    public Details(int albumCoverId, String songArtist, String songTitle, int playButtonId){
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mPlaybuttonId = playButtonId;
        mAlbumCoverId = albumCoverId;

    }

    //Get the song title
    public String getSongTitle(){
        return mSongTitle;
    }

    //Get the song artist

    public String getSongArtist() {
        return mSongArtist;
    }

    //Get the play button image
    public int getPlayButtonId() {return mPlaybuttonId; }

    //Get the album cover image
    public int getAlbumCoverId() {return mAlbumCoverId; }
}
