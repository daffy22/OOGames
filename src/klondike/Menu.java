package klondike;

import mastermind.GestorIO;

class Menu {
    public int getOption() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("1: Move from deck to waste\n");
        gestorIO.out("2: Move from waste to suit\n");
        gestorIO.out("3: Move from waste to column\n");
        gestorIO.out("4: Move from suit to column\n");
        gestorIO.out("5: Move from column to suit\n");
        gestorIO.out("6: Move from column to column\n");
        gestorIO.out("7: Flip a card in column\n");
        gestorIO.out("8: Move waste to deck\n");
        gestorIO.out("9: Exit\n");
        gestorIO.out("Option? [1-9]: ");
        return gestorIO.inInt();
    }
}
