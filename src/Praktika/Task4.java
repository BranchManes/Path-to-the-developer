package Praktika;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int container = 0, count, container2 = 0;
        while (true) {
            System.out.println("Введите число: ");
            count = s.nextInt();
            container++;
            container2 += count;
            if (count == 999) {
                System.out.println("Вы ввели 999, завершение работы программы");
                break;
            }
            System.out.println("Количество введенных раз чисел: " + container + "," + "Сумма этих значений: " + container2);
        }
    }
}
