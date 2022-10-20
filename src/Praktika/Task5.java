package Praktika;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int cap;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        cap = s.nextInt();
        int[] array = new int[cap];
        fill(array);
        write(array);
    }

    static void fill(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);

        }
        System.out.println("Массив: " + Arrays.toString(array));
    }

    static void write(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(  array[i] + " ");
        }
        System.out.println();
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }


    }
}

