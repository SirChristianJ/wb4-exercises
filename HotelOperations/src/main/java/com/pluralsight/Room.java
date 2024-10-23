package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable(){
        return (!isDirty() && !isOccupied());
    }

    public void checkIn(){
        if(isAvailable()) {
            occupied = true;
            dirty = true;
            System.out.println("Successfully checked in!");
        }
        else if(dirty){
            System.out.println("Room has yet to be prepared");
        }
        else
            System.out.println("Room is occupied");
    }

    public void cleanRoom(){
        System.out.println("Cleaning room..");
        dirty = false;
        System.out.println("Room cleaned.");
    }

    public void checkOut(){
        System.out.println("Checked out, pending cleaning.");
        dirty = true;
        occupied = false;
        //cleanRoom();
    }
}
