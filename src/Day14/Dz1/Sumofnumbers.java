package Day14.Dz1;

import Day14.Dz1.InvalidinputfileException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sumofnumbers {
    public static void printSumDigits(File file,Scanner scanner) throws IOException, InvalidinputfileException {
        int count = 0;
        int sum = 0;
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        if (numbers.length !=10) {
            throw new InvalidinputfileException();
        }

        for (String s : numbers) {
            sum+= Integer.parseInt(s);
        }

        System.out.println("Сумма всех чисел с файла: " + sum);


    }
}