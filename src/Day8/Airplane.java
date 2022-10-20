package Day8;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weigth;
    private double fuel;

    public Airplane(String producer, int year, double length, double weigth, double fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
        this.fuel = fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public double getWeigth() {
        return weigth;
    }

    public void getInfo() {
        System.out.println("Изготовитель: " + getProducer() + "," + "год выпуска: " +
                +getYear() + "," + "длина: " + getLength() + "," + "вес: " + getWeigth() + "," +
                "количество топлива в баке: " + getFuel());

    }
    public double fillUp( double up){
        fuel += up;
        return  fuel;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + getProducer() + "," + "год выпуска: " +
                +getYear() + "," + "длина: " + getLength() + "," + "вес: " + getWeigth() + "," +
                "количество топлива в баке: " + getFuel();
    }
}
