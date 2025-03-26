package klondike;

import mastermind.GestorIO;

class Waste {

    private Card[] cards;

    public Waste() {
        cards = new Card[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = new Card();
        }
    }

    public void show() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("Waste cards:\n");
        int size = this.size();
        gestorIO.out(cards[size() - 2].show() + " " + cards[size - 1].show() + " " + cards[size].show());
    }

    public void moveTo(Suit suits) {
        Card card = this.getCard();
        cards[size()] = null;
        suits.add(card);
    }

    public void moveTo(Column column) {
        Card card = this.getCard();
        cards[size()] = null;
        column.add(card);
    }

    public void moveTo(Deck deck) {
        for (int i = size(); i >= 0; i--) {
            Card card = cards[i];
            cards[i] = null;
            deck.add(card);
        }
    }

    public void add(Card[] three) {
        cards[size() + 1] = three[0];
        cards[size() + 2] = three[1];
        cards[size() + 3] = three[2];
    }

    private Card getCard() {
        return cards[size()];
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
}
