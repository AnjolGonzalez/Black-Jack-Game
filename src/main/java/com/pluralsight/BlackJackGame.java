package com.pluralsight;

import java.util.Scanner;

public class BlackJackGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Deck deck = new Deck();
        Hands hands = new Hands();
        Hands hands2 = new Hands();

        deck.shuffle();

        System.out.print("Player 1\n" +
                "Please enter your name: ");
        String playerName = scan.nextLine();

        System.out.print("Player 2\n" +
                "Please enter your name:");
        String player2Name = scan.nextLine();


        for (int i = 0; i < 2; i++) {
            Cards cards = deck.dealer();
            hands.dealer(cards);
        }
        for (int i = 0; i < 2; i++) {
            Cards cards = deck.dealer();
            hands2.dealer(cards);
        }

        int handRank = hands.getRank();
        System.out.println(playerName + " " + handRank);

        int handRank2 = hands2.getRank();
        System.out.println(player2Name + " " + handRank2);

        if (handRank > handRank2 && handRank <= 21) {
            System.out.println("Player 1 wins!\n" +
                    " Better luck next time!");
        } else if (handRank2 > handRank && handRank2 <= 21) {
            System.out.println("Player 2 wins!\n" +
                    "Better luck next time!");
        }else {
            System.out.println("It's a tie!");
        }
    }
}
