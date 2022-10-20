package Day8;

public class Dz8 {
    public static void fill() {
        String st = " ";
        for (int i = 0; i <= 20000; i++) {
            st += i + " ";

        }
        System.out.println(st);
    }


    public static void fillStringBuilder() {
        int container2 = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            s.append(i).append(" ");

        }
        System.out.println(s.toString());
    }
}