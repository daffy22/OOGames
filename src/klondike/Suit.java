package klondike;

import mastermind.GestorIO;

class Suit {

    private int suit;
    private Card[] cards;

    public Suit(int suit) {
        this.suit = suit;
        cards = new Card[13];
        for (int i = 0; i < 13; i++) {
            cards[i] = new Card();
        }
    }

    public void show() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("Suit: " + getSuit());
        for (int i = 0; i < 12; i++) {
            cards[i].show();
        }
    }

    private String getSuit() {
        return switch (suit) {
            case 0 -> "♥";
            case 1 -> "♦";
            case 2 -> "♣";
            case 3 -> "♠";
            default -> "";
        };
    }

    public void moveTo(Column column) {
        column.add(getLastCard());
    }

    private Card getLastCard() {
        for (int i = 13; i >= 0; i--) {
            if (cards[i].isValid()) {
                return cards[i];
            }
        }
        return null;
    }

    public void add(Card card) {
        for (int i = 0; i < 13; i++) {
            if (!cards[i].isValid()) {
                cards[i] = card;
            }
        }
    }
}
