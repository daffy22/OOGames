package klondike;

import mastermind.GestorIO;

class Column {

    private int column;
    private Card[] cards;

    public Column(int column, Deck deck) {
        this.column = column;
        cards = new Card[52];
        cards = deck.getCardsToColumn(column);
    }

    public void show() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("Column: " + column + 1);
        for (Card card : cards) {
            if (card != null) {
                gestorIO.out(card.show());
            }
        }
    }

    public void moveTo(Column toColumn) {
        toColumn.add(getLastCard());
    }

    public void moveTo(Suit suit) {
        suit.add(getLastCard());
    }

    private Card getLastCard() {
        for (int i = 0; i < 52; i++) {
            if (cards[i] == null) {
                return cards[i - 1];
            }
        }
        return null;
    }

    public void add(Card card) {
        for (int i = 0; i < 52; i++) {
            if (cards[i] == null) {
                cards[i] = card;
            }
        }
    }
}
