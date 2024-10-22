package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {
        Reservation r = new Reservation("blue",4,true);
        r.setRoomType("king");
        //r.setIsWeekend(false);

        System.out.printf("\n%s %s is: $%.2f","The base price per night for",r.getRoomType(), r.getPrice());
        System.out.printf("\n%s: $%.2f","The total for the reservation is",r.getReservationTotal());
    }
}