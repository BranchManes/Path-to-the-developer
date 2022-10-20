package Day9;

public class Student extends Human{
   private String nameStadyGroup;

    public String getNameStadyGroup() {
        return nameStadyGroup;
    }

    public void setNameStadyGroup(String nameStadyGroup) {
        this.nameStadyGroup = nameStadyGroup;
    }

    public Student(String name, String nameStadyGroup) {
        super(name);
        this.nameStadyGroup = nameStadyGroup;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + this.getName());
    }
}
