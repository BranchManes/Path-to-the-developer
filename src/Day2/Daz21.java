package Day2;

import java.util.Scanner;

public class Daz21 {
    public static void main(String[] args) {
        int count;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество этажей: ");
        count = s.nextInt();

        if (count >= 1 && count <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (count >= 5 && count <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (count >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
