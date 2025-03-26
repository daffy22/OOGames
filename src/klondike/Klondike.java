package klondike;

import mastermind.GestorIO;

class Klondike {

    private Deck deck;
    private Waste waste;
    private Suit[] suits;
    private Column[] columns;

    private Klondike() {
        deck = new Deck();
        waste = new Waste();
        suits = new Suit[4];
        for (int i = 0; i < suits.length; i++) {
            suits[i] = new Suit(i);
        }
        columns = new Column[7];
        for (int i = 0; i < columns.length; i++) {
            columns[i] = new Column(i+1, deck);
        }
    }

    private void play() {
        Menu menu = new Menu();
        GestorIO gestorIO = new GestorIO();
        int option;
        do {
            show();
            option = menu.getOption();
            switch (option) {
                case 1 -> deck.moveTo(waste);
                case 2 -> {
                    gestorIO.out("Select a suit [1-4]: ");
                    waste.moveTo(suits[gestorIO.inInt() - 1]);
                }
                case 3 -> {
                    gestorIO.out("Select a column [1-7]: ");
                    Column column = columns[gestorIO.inInt() - 1];
                    waste.moveTo(column);
                }
                case 4 -> {
                    gestorIO.out("Select a suit [1-4]: ");
                    Suit suit = suits[gestorIO.inInt() - 1];
                    gestorIO.out("Select a column [1-7]: ");
                    Column column = columns[gestorIO.inInt() - 1];
                    suit.moveTo(column);
                }
                case 5 -> {
                    gestorIO.out("Select a column [1-7]: ");
                    Column column = columns[gestorIO.inInt() - 1];
                    gestorIO.out("Select a suit [1-4]: ");
                    Suit suit = suits[gestorIO.inInt() - 1];
                    column.moveTo(suit);
                }
                case 6 -> {
                    gestorIO.out("Select a column [1-7]: ");
                    Column column = columns[gestorIO.inInt() - 1];
                    gestorIO.out("To column [1-7]: ");
                    Column toColumn = columns[gestorIO.inInt() - 1];
                    column.moveTo(toColumn);
                }
                case 7 -> {
                }
                case 8 -> {
                    waste.moveTo(deck);
                }
                default -> option = 9;
            }

        } while (option != 9);
    }

    private void show() {
        deck.show();
        waste.show();
        for (Suit suit : suits) {
            suit.show();
        }
        for (Column column : columns) {
            column.show();
        }
    }

    public static void main(String[] args) {
        new Klondike().play();
    }
}
