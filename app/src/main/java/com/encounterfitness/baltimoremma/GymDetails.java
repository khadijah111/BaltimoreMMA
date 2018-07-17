package com.encounterfitness.baltimoremma;

public class GymDetails {
    //Name of the gym
    private String mGymName;

    //Address of the gym
    private String mGymAddress;

    //Gym image ID
    private int mGymImageId;

    //Create a new gym item
    public GymDetails(int gymImageID, String gymAddress, String gymName){
        mGymName = gymName;
        mGymAddress = gymAddress;
        mGymImageId = gymImageID;
    }

    //Create a new gym item without an image
    public GymDetails(String gymAddress, String gymName){
        mGymName = gymName;
        mGymAddress = gymAddress;
    }

    //Get the name of the gym
    public String getmGymName(){
        return mGymName;
    }

    //Get the address of the gym
    public String getmGymAddress() {
        return mGymAddress;
    }


    //Get the gym image if there is one
    public int getmGymImageId() {return mGymImageId; }
}
