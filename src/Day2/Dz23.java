package Day2;

import java.util.Scanner;

public class Dz23 {
    public static void main(String[] args) {
        double count;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        count = s.nextDouble();
        if (count >= 5) {
            System.out.println(((count * count) - 10) / (count + 7));
        } else if (count > -3 && count < 5) {
            System.out.println(((count + 3) * ((count * count) - 2)));
        } else {
            System.out.println(420);
        }
    }
}
