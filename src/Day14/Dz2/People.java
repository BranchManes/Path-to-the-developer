package Day14.Dz2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class People {
    public static List<String> parseFileToStringList(File file, Scanner scanner)  throws AgeException {
        List<String> list = new ArrayList<>();
        int count =0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            list.add(line);
            String [] age = line.split(" ");
            if(Integer.parseInt(age[1])<0){
                throw new AgeException();
            }

        }


        return list;

    }
}

class TestMain {
    public static void main(String[] args) {
        File file = new File("people.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println(People.parseFileToStringList(file, scanner));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (AgeException e){
            System.out.println("Неккоректный входной файл");
        }


    }
}
