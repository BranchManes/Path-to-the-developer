package Praktika;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void fill(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = r.nextInt(91) + 10;
            array[array.length - i - 1] = array[i];
        }
        System.out.println("Ваш массив: " + Arrays.toString(array));
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        Task10.fill(array);
    }
}
