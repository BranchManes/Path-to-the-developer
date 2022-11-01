package Praktika;

import Day14.Dz3.AgeException;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class NumbersException extends Exception {

}

public class Tasl13 {
    public static void MinimumAndMaximumNumberOfTheFile(Scanner scanner) throws NumbersException {
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        if (numbers.length != 20) {
            throw new NumbersException();
        }
        int[] array = new int[20];
        int count = 0;
        for (String s : numbers) {
            array[count++] = Integer.parseInt(s);
        }
        System.out.println("Массив чисел из файла: " + Arrays.toString(array));
        int minNumberArray = array[0];
        int maxNumberArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumberArray) {
                minNumberArray = array[i];
            }
        }
        System.out.println("Минимальное число с файла: " + minNumberArray);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumberArray) {
                maxNumberArray = array[i];
            }
        }
        System.out.println("Максимальное число с файла: " + maxNumberArray);
    }
}


class Test50 {
    public static void main(String[] args) {
        File file = new File("Numbers");
        try {
            Scanner sc = new Scanner(file);
            Tasl13.MinimumAndMaximumNumberOfTheFile(sc);
        } catch (IOException e) {
            System.out.println("Файл не найден");
        } catch (NumbersException e) {
            System.out.println("Неккоректный файл");
        }
    }
}



