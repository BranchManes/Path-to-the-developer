package Day14.Dz3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human {
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Human> parseFileToStringList() {
        List<Human> list = new ArrayList<>();
        File file = new File("people.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] human = line.split(" ");
                if (Integer.parseInt(human[1]) < 0) {
                    throw new AgeException();
                }
                Human person = new Human(human[0], Integer.parseInt(human[1]));
                list.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (AgeException e) {
            System.out.println("Некорректный входной файл");
        }
        return list;
    }
}

class TestHuman {
    public static void main(String[] args) {
        System.out.println(Human.parseFileToStringList());
    }
}
