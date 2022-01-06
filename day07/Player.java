package day07;

public class Player {
    private int stamina;

    private final static int MAX_STANINA = 100;
    private final static int MIN_STANINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("The teams are not complete yet " + (6 - countPlayers) + " spots available.");
        } else {
            System.out.println("There are no more places on the teams. ");
        }
    }
}
