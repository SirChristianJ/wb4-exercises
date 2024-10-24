package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void Deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue() throws Exception {
        int handValue = 0;
        for(Card card: cards){
            card.flip();
            handValue += card.pointValue();
            card.flip();
        }
        return handValue;
    }
}
