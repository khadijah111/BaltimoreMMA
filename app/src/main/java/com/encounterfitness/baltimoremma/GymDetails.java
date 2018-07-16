package com.encounterfitness.baltimoremma;

public class GymDetails {
    //Name of the gym
    private String mGymName;

    //Address of the gym
    private String mGymAddress;

    //Gym image ID
    private int mGymImageId;

    //Create a new song item
    public GymDetails(int gymImageID, String gymAddress, String gymName){
        mGymName = gymName;
        mGymAddress = gymAddress;
        mGymImageId = gymImageID;

    }

    //Get the name of the gym
    public String getmGymName(){
        return mGymName;
    }

    //Get the song artist

    public String getmGymAddress() {
        return mGymAddress;
    }


    //Get the album cover image
    public int getmGymImageId() {return mGymImageId; }
}
