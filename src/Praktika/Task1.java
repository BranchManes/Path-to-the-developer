package Praktika;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner sc1 = new Scanner(System.in);
        int count = sc1.nextInt();
        if (count > 0) {
            count *= 2;
            System.out.println("Ваше число увеличилось в два раза: " + count);
        }

    }
}
