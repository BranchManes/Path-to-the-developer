package Day16.Dz2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        Random random = new Random();

        try {
            PrintWriter pw = new PrintWriter(file1);
            for (int i = 0; i < 1000; i++) {
                pw.println(random.nextInt(100));
            }
            pw.close();
            Scanner sc = new Scanner(file1);
            File file2 = new File("file2.txt");
            PrintWriter pw2 = new PrintWriter(file2);
            int sum = 0;
            int count = 0;
            while (sc.hasNextLine()) {
                sum += Integer.parseInt(sc.nextLine());
                count++;
                if (count == 20) {
                    pw2.println(sum / 20.0);
                    count = 0;
                    sum = 0;
                }

            }
            pw2.close();
            Scanner sc2 = new Scanner(file2);
            int sum2 = 0;
            while (sc2.hasNextLine()) {
                sum2 += Double.parseDouble(sc2.nextLine());
            }
            System.out.println("Сумма всех чисел из file2: " + sum2);

        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }

}

