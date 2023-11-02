package com.pluralsight;

public class Cards {
    private String suit;
    private String value;
    private boolean isFaceUp;
    public Cards(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit() {
        if (isFaceUp) {
            return suit;
        } else {
            return null;
        }
    }
    public int getPointRank() {
        if (isFaceUp) {
            if (value.equalsIgnoreCase("A")) {
                return 11;
            } if (value.equalsIgnoreCase("K") || value.equals("Q") || value.equals("J")) {
                return 10;
            }
            return Integer.parseInt(value);
        }
        else {
            return 0;
        }
    }
    public boolean isFaceUp() {
        return isFaceUp;
    }
    public void flipCard() {
        isFaceUp = !isFaceUp;
    }
}
