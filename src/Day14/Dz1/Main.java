package Day14.Dz1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Test");
        try {
            Scanner scanner = new Scanner(file);
            Sumofnumbers.printSumDigits(file,scanner);
        } catch (IOException e) {
            System.out.println("Файл не найден");
        } catch (InvalidinputfileException e) {
            System.out.println("Неккоректный входной файл");
        }

    }
}
