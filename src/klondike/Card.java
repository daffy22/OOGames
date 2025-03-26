package klondike;

class Card {

    private int suit;
    private int rank;

    public Card() {
        suit = 0;
        rank = 0;
    }

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String show() {
        return getRank() + getSuit();
    }

    private String getRank() {
        return String.valueOf(rank + 1);
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

    public boolean isValid() {
        return suit != 0 && rank != 0;
    }
}
