package Day12;

import java.util.ArrayList;
import java.util.List;

public class Dz121 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Mercedes");
        list.add("Honda");
        list.add("Audi");
        list.add("Kia");
        System.out.println(list);

        list.add(list.size() / 2, "Dodge");
        System.out.println(list);

        list.remove(0);

        System.out.println(list);

    }
}
