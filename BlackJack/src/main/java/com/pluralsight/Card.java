package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit(){
        if(isFaceUp)
            return suit;
        else
            return "#";
    }

    public String getValue(){
        if(isFaceUp)
            return value;
        else
            return "#";
    }

    public int pointValue() throws Exception {
       if(isFaceUp) {
            return switch (value) {
                case "1" -> 1;
                case "2" -> 2;
                case "3" -> 3;
                case "4" -> 4;
                case "5" -> 5;
                case "6" -> 6;
                case "7" -> 7;
                case "8" -> 8;
                case "9" -> 9;
                case "10", "j", "J", "q", "Q", "k", "K" -> 10;
                case "A" -> 11;
                default -> throw new Exception("Invalid card value");
            };
        }
       else
           throw new Exception("Card is not face up.");
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip(){
        isFaceUp = !isFaceUp;
    }

}
