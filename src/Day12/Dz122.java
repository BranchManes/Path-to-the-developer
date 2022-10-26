package Day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dz122 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            Integer rand = r.nextInt(30);
            if (rand % 2 == 0) {
                list.add(rand);
            }
        }
        System.out.println(list);
        for (int i = 300; i >= 300 && i <= 350; i++) {
            Integer rand = r.nextInt(51) + 300;
            if (rand % 2 == 0) {
                list.add(rand);
            }
        }
        System.out.println("Второе заполнение массива");
        System.out.println(list);
    }
}
