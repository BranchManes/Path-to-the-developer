package Day16.Dz1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArithmeticMeanOfNumbers {
    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            double[] numbersArray = new double[7];
            int count = 0;
            double sum = 0;
            for (String s : numbers) {
                numbersArray[count++] = Integer.parseInt(s);
            }
            for (int i = 0; i < numbersArray.length; i++) {
                sum += numbersArray[i] / numbersArray.length;
            }
            System.out.println("Среднее арифметическое этих чисел: " + sum);
            System.out.printf("Округленное среднее арифметическое этих чисел: %.3f", sum);
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }

    }
}
