package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Hotel test = new Hotel("Hilton", 200, 400);
        test.bookRoom(3,true);
        test.bookRoom(2,false);
        System.out.println(test.getAvailableSuites());
        System.out.println(test.getAvailableRooms());
    }
}