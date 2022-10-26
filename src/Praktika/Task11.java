package Praktika;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void fill(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = r.nextInt(91) + 10;
            array[array.length / 2 + i] = array[i];
        }
        System.out.println("Массив: " + Arrays.toString(array));
    }
}

class TestTask11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        Task11.fill(array);
    }
}
