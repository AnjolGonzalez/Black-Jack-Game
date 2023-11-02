package com.pluralsight;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public ArrayList<Cards> cards;
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7",
                "8","9","10","J","Q","K","A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                Cards card1 = new Cards(suit, rank);
                cards.add(card1);
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(cards);
    }
    public Cards dealer() {
        if (cards.size() > 0) {
            Cards card1 = cards.remove(0);
            return card1;
        }else{
            return null;
        }
    }
    public int size() {
        return cards.size();
    }
}
