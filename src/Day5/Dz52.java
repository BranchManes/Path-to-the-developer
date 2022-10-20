package Day5;

public class Dz52 {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike(2011, "Red", "Yemaha");
        bike1.getInfo();
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
}