package Day3;

import java.util.Scanner;

public class Dz33 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите число: ");
            double delimoe = s.nextDouble();
            System.out.println("Введите число: ");
            double delitel = s.nextDouble();
            if (delitel == 0) {
                System.out.println("Деление на 0");
                continue;

            }
            System.out.println("Результат деления: " + (delimoe / delitel));
        }
    }
}
