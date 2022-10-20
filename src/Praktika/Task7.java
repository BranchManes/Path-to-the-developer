package Praktika;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = s.nextInt();
        int[] array = new int[arraySize];
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
        System.out.println("Первая половина массива:");
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Вторая половина массива:");
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            System.out.print(array[i] + " ");
        }
    }


}


