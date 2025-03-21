package mastermind;

class Attempt {

    private int limit;
    private int attemp;

    public Attempt() {
        limit = 10;
        attemp = 0;
    }

    public Attempt(int limit) {
        this.limit = limit;
        attemp = 0;
    }

    public void showCurrentlyAttempts() {
        GestorIO gestor = new GestorIO();
        gestor.out(attemp + " attempt(s): ");
        gestor.lineSeparator();
    }

    public boolean thereAreAttempts() {
        return limit >= attemp;
    }

    public int currentlyAttempt() {
        return attemp;
    }

    public void nextAttempt() {
        attemp++;
    }
}
