package klondike;

import mastermind.GestorIO;

class Deck {

    private Card[] cards;

    public Deck() {
        cards = new Card[52];
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[counter] = new Card(i, j);
                counter++;
            }
        }
    }

    public void show() {
        GestorIO gestorIO = new GestorIO();
        for (int i = 0; i < 52; i++) {
            gestorIO.out(cards[i].show() + "\n");
        }
    }

    public void moveTo(Waste waste) {
        waste.add(getThreeCards());
    }

    public void add(Card card) {
        cards[size()] = card;
    }

    private Card[] getThreeCards() {
        Card[] threeCards = new Card[3];
        int counter = 0;
        for (int i = size(); counter < 3; i--) {
            threeCards[counter] = cards[i];
            cards[i] = null;
            counter++;
        }
        return threeCards;
    }

    private int size() {
        int counter = 0;
        for (int i = 0; i < 52; i++) {
            if (cards[i] != null) {
                counter++;
            } else {
                return counter;
            }
        }
        return counter;
    }

    public Card[] getCardsToColumn(int column) {
        Card[] cards = new Card[52];
        for (int i = 0; i < column + 1; i++) {
            cards[i] = getLastCard();
        }
        return cards;
    }

    private Card getLastCard() {
        for (int i = size(); i >= 0; i--) {
            if (cards[i] != null) {
                return cards[i];
            }
        }
        return null;
    }
}
