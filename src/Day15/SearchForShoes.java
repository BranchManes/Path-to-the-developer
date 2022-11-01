package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SearchForShoes {
    public static void ActionFile(Scanner scanner) throws FileNotFoundException {
        File file = new File("missing_shoes.txt");
        PrintWriter pw = new PrintWriter(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] shoes = line.split(",");
            if (Integer.parseInt(shoes[2]) == 0) {
                pw.println(shoes[0] + "," + shoes[1] + "," + shoes[2]);
            }
        }
        pw.close();
        scanner.close();
    }
}


class TestSearchForShoes {
    public static void main(String[] args) {
        File file = new File("Shoes.txt");
        try {
            Scanner sc = new Scanner(file);
            SearchForShoes.ActionFile(sc);
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}