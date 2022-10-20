package Day3;

import java.util.Scanner;

public class Dz31 {
    public static void main(String[] args) {

        while (true) {

            Scanner s = new Scanner(System.in);
            String count = s.nextLine();
            if (count.equals("Stop")) { // break отсновит цикл, т.к он выполняется в блоке while
                break;
            }

            switch (count) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");

            }


        }
    }
}

