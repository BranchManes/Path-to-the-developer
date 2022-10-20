package Day3;

import java.util.Scanner;

public class Dz32 {
    public static void main(String[] args) {
        double delimoe;
        double delitel;
        double count;
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите число: ");
            delimoe = s.nextDouble();
            System.out.println("Введите число: ");
            delitel = s.nextDouble();
            if (delitel == 0) {
                System.out.println("Вы ввели 0, завершение программы");
                break;
            }
            System.out.println("Результат деления: " + (delimoe / delitel));

        }
    }
}
