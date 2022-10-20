package Day2;

import java.util.Scanner;

public class Dz22 {
    public static void main(String[] args) {
        int count1;
        int count2;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        count1 = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        count2 = s2.nextInt();
        if (count1 >= count2) {
            System.out.println("Неккоректный ввод");
        } else {
          /*  for (int i = count1 + 1; i < count2; i++) { // Первый вариант решения
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }*/
            int i = count1 + 1; // Второе решение
            while (i < count2) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}