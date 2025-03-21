package mastermind;

class Board {

    private String[] history;
    private Combination combination;

    public Board() {
        history = new String[10];
        combination = new Combination();
    }

    public boolean thereIsAWinner(int currentlyAttempt) {
        for (int i = 0; i < currentlyAttempt; i++) {
            if (combination.isTheCombination(history[i])) {
                return true;
            }
        }
        return false;
    }

    public void showHistory(int currentlyAttempt) {
        GestorIO gestorIO = new GestorIO();
        for (int i = 0; i < currentlyAttempt; i++) {
            gestorIO.out(history[i] + " --> " + combination.combinationResultBlacksAndWhites(history[i]));
            lineSeparator() ;
        }
    }

    public void putCombination(String combination, int currentlyAttempt) {
//        if combination.hasErrors(combination)
        history[currentlyAttempt] = combination;
        lineSeparator();
    }

    private void lineSeparator() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.lineSeparator();
    }
}
