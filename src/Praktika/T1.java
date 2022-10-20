package Praktika;

public class T1 {
    String a;

    public String reser(String s) {
        return s.toUpperCase();
    }


}

class T1Test {
    public static void main(String[] args) {
        T1 t = new T1();
        t.a = "ivan";
        System.out.println(t.reser(t.a));
        System.out.println(t.a);
    }
}
