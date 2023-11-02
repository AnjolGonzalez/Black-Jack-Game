package com.pluralsight;
import java.util.ArrayList;

public class Hands {
    public ArrayList<Cards> cards;
    public String name;
    public Hands() {
        this.name = name;
        cards = new ArrayList<>();
    }

    public void dealer(Cards card) {
        cards.add(card);
    }
    public String getName() {
        return this.name;
    }
    public int size() {
        return cards.size();
    }

    public int getRank() {
        int rank = 0;
        for (Cards card : cards) {
            card.flipCard();
            rank += card.getPointRank();
            card.flipCard();
        }
        return rank;
    }
}
