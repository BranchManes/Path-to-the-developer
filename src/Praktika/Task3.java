package Praktika;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int count;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        count = s.nextInt();
        while (count != 5) {
            System.out.println("Введите пять");
            count = s.nextInt();
        }
        System.out.println("Ввели пять: " + count);
    }
}
