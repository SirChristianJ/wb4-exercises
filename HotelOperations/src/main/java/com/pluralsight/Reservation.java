package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfnights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfnights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfnights = numberOfnights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() throws Exception {
        double price = 0;
        if(roomType.equalsIgnoreCase("king"))
            price = 139;
        else if(roomType.equalsIgnoreCase("double"))
            price = 124;
        else
            throw new Exception("Please select king or double!");
        return price;
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

    public double getReservationTotal() throws Exception{
        double total = 0;

        if(isWeekend())
            total = numberOfnights*(getPrice()+(getPrice()*0.1));
        else
            total = numberOfnights*getPrice();


        return total;
    }

}
