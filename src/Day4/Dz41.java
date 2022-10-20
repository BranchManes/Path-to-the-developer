package Day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Dz41 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите желаемый размер массива: ");
        int count = s.nextInt();
        int container = 0;
        int container1 = 0;
        int container2 = 0;
        int container3 = 0;
        int sum = 0;
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                container++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                container1++;

            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                container2++;

            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                container3++;

            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }


        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + container);
        System.out.println("Количество чисел равных 1: " + container1);
        System.out.println("Количество четных чисел: " + container2);
        System.out.println("Количество нечетных чисел: " + container3);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
