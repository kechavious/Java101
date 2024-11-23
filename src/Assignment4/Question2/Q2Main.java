package Assignment4.Question2;

import java.util.*;


public class Q2Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Card Guessing Game!");
        System.out.println("Guess the card by entering its face and suit, like '7 Diamonds'.");

        while (true) {
            Deck.Card randomCard = deck.drawRandomCard();
            

            if (randomCard == null) {
                System.out.println("Ran out of cards. You didn't guess my card.. sorry..");
                break;
            }
            String face = randomCard.getFace();
            String suit = randomCard.getSuit();
            System.out.println(face);
            System.out.println(suit);

            System.out.print("Guess the card (face suit): ");
            String faceGuess = scanner.next();
            String suitGuess = scanner.nextLine().trim();

            if (randomCard.getFace().equalsIgnoreCase(faceGuess) && randomCard.getSuit().equalsIgnoreCase(suitGuess)) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect! Try again.");
            }
        }
        scanner.close();
    }


}

