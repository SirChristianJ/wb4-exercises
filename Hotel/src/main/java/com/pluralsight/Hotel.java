package com.pluralsight;

public class Hotel {
    //private String roomType;
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    /*public String getRoomType() {
        return roomType;
    }*/

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite && numberOfRooms<getAvailableSuites()) {
            bookedSuites += numberOfRooms;
            return true;
        } else if (!isSuite && numberOfRooms<getAvailableRooms()) {
            bookedRooms += numberOfRooms;
            return true;
        }
        return false;
    }

    public int getAvailableSuites(){
        return numberOfSuites-bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms-bookedRooms;
    }


}
