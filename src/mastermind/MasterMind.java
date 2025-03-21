package mastermind;

class MasterMind {

    private Board board;
    private Player player;
    private Attempt attempt;

    public MasterMind() {
        board =  new Board();
        player = new Player();
        attempt = new Attempt();
    }

    public void play() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("----- MASTERMIND -----");
        gestorIO.lineSeparator();
        gestorIO.lineSeparator();

        do {
            attempt.showCurrentlyAttempts();
            board.showHistory(attempt.currentlyAttempt());
            board.putCombination(player.proposeCombination(), attempt.currentlyAttempt());
            attempt.nextAttempt();
        } while (!board.thereIsAWinner(attempt.currentlyAttempt()));

        if (board.thereIsAWinner(attempt.currentlyAttempt())) {
            player.singVictory();
        } else {
            GestorIO gestor = new GestorIO();
            gestor.out("The game is over");
        }
    }

    public static void main(String[] args) {
       MasterMind masterMind = new MasterMind();
       masterMind.play();
    }
}
