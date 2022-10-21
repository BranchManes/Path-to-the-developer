package Day11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый склад: ");
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        System.out.println(warehouse + " " + picker + " " + courier);
        for (int i = 0; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + " " + picker + " " + courier);
        System.out.println("Второй склад: ");
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        System.out.println(warehouse1 + " " + picker1 + " " + courier1);
        for (int i = 0; i <= 1500; i++) {
            picker1.doWork();
            courier1.doWork();
        }
        picker1.bonus();
        courier1.bonus();
        System.out.println(warehouse1 + " " + picker1 + " " + courier1);
        System.out.println(" ");

    }
}
