package Day5;

public class Dz51 {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setYearRelise(2015);
        auto1.setModel("Mazda");
        auto1.setColor("Blue");
        System.out.println(  auto1.getYearRelise());
        System.out.println(auto1.getModel());
        System.out.println(auto1.getColor());
    }
}
class Auto{
    private int yearRelise;
    private String color;
    private String model;

    public void setYearRelise (int yearRelise){
        this.yearRelise = yearRelise;
    }
    public void setColor(String color){
        this.color = color;
    }
    public  void setModel(String model){
        this.model = model;
    }
    public int getYearRelise(){
        return yearRelise;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}
