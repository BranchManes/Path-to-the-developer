package Day7;

import java.util.Random;

public class Player {
    private int stamina;
    public static int MAX_STAMINA = 100;
    public static int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Player() {
        Random r = new Random();
        if (countPlayers < 6) {
            countPlayers++;
        }
        stamina = r.nextInt(11) + 90;
        this.stamina = stamina;

    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        for (int i = stamina; i >= 0; i--) {
            if (i == 0) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        System.out.println("Количество игроков на поле: " + countPlayers);
        if (countPlayers == 6) {
            System.out.println("Команды полные, нет свободных мест");
        } else if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле ещё есть " + (6 - countPlayers) + " свободных мест");
        }


    }
}
