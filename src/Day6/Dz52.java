package Day6;

public class Dz52 {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike(2011, "Red", "Yemaha");
        bike1.getInfo();
        bike1.info();
        int difference = bike1.yearDifference(2016);
        System.out.println(difference);
    }
}

class Motorbike {
    private int yearRelise;
    private String color;
    private String model;

    public Motorbike(int yearRelise, String color, String model) {
        this.yearRelise = yearRelise;
        this.color = color;
        this.model = model;
    }

    public int getYearRelise() {
        return yearRelise;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void getInfo() {
        System.out.println("Модель мотоцикла: " + getModel() + "," + " год выпуска: " + getYearRelise() + "," + " цвет мотоцикла: " + getColor() + ".");
    }

    public void info() {
        System.out.println("Это мотоцикл" + "," + "модель мотоцикла: " + getModel());
    }

    public int yearDifference(int year) {
        return Math.abs(year - yearRelise);
    }
}