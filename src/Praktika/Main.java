package Praktika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int container = sc.nextInt();
        int[] array = new int[container];
        Task9.fill(array);
        Task9.write(array);
    }
}
