package mastermind;

class Player {
    public String proposeCombination() {
        GestorIO gestor = new GestorIO();
        gestor.out("Propose a combination: ");
        return gestor.inString();
    }

    public void singVictory() {
        GestorIO gestor = new GestorIO();
        gestor.out("You've won!");
    }
}
