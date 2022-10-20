package Praktika;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int container = s.nextInt();
        int[] array = new int[container];
        fill(array);
        write(array);


    }

    static void fill(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        System.out.println("Массив: " + Arrays.toString(array));
    }

    static void write(int[] array) {
        System.out.println("Четные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Нечетные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
