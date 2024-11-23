package Assignment4.Question2;

import java.util.Random;


public class Deck {
    private final static int DECK_MAX_SIZE = 52;
    Card[] cards;

    public Deck(){
        setupDeck();
    }
    private void setupDeck(){
        cards = new Card[DECK_MAX_SIZE];
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faces = {"2", "3", "4", "5", "6", "7",
                "8", "9", "10", "J", "Q", "K", "A"};

        int index = 0;
        for (String i:suits){
            for(String j:faces){
                cards[index] = new Card(i,j);
                index++;
            }
        }
    }
    public void shuffleDeck(){
        Random random = new Random();
        for(int i = 0; i < cards.length;i++){
            int j = random.nextInt(cards.length-i);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Deck.Card drawRandomCard() {
        Random random = new Random();
        int remainingCards = 0;
        for (Deck.Card card : this.cards) {
            if (card != null){
                remainingCards++;
            }
        }
        if (remainingCards == 0) {
            return null;
        }

        int cardIndex = random.nextInt(remainingCards);
        for (int i = 0, seen = 0; i < this.cards.length; i++) {
            if (this.cards[i] != null) {
                if (seen == cardIndex) {
                    Deck.Card selectedCard = this.cards[i];
                    this.cards[i] = null;
                    return selectedCard;
                }
                seen++;
            }
        }
        return null;
    }

    public class Card{
        private String suit;
        private String face;

        public String getSuit(){
            return suit;
        }
        public void setSuit(String suit){
            this.suit =suit;
        }

        public String getFace(){
            return face;
        }
        public void setFace(String face){
            this.face= face;
        }

    public Card(){

        }
    public Card(String suit, String face){
            this.suit = suit;
            this.face = face;
        }
    }
}

