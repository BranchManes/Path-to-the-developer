package Praktika;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        boolean a = true;
        int count;
        while (a) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите целое число:");
            count = sc.nextInt();
            if (count == 0) {
                System.out.println("Вы ввели число " + count + "," + " завершение программы");
                a = false;
            }
            if (count > 0) {
                System.out.println("Плюс");
            }
            else  {
                System.out.println("Минус");
            }

        }
    }

}
