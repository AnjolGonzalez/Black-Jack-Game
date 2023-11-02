package com.pluralsight;

public class Cards {
    private String suit;
    private String rank;
    private boolean isFaceUp;
    public Cards() {
        this.suit = suit;
        this.isFaceUp = false;
    }
    public String getSuit() {
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }
    public int getRank() {
        if (isFaceUp) {
            if (rank.equalsIgnoreCase("A")) {
                return 11;
            } else if (rank.equalsIgnoreCase("K") || rank.equals("Q") || rank.equals("J")) {
                return 10;
            }
        }
        else {
            return 0;
        }
        return Integer.parseInt(rank);
    }
    public int getPointRank() {
        if (isFaceUp) {
            return this.getRank();
        }else {
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
