package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfnights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfnights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfnights = numberOfnights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfnights() {
        return numberOfnights;
    }

    public void setNumberOfnights(int numberOfnights) {
        this.numberOfnights = numberOfnights;
    }

    public boolean isWeekend(){
        return weekend;
    }

    public void setIsWeekend(boolean weekend){
        this.weekend = weekend;
    }

    public double getReservationTotal(){
        double total = 0;

        if(getRoomType().equalsIgnoreCase("king"))
            price = 139;
        else if(getRoomType().equalsIgnoreCase("double"))
            price = 124;


        if(isWeekend())
            total = getNumberOfnights()*price*(price*0.1);
        else
            total = getNumberOfnights()*price;

        return total;

    }

}
