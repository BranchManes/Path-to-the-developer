package Day9;

public class Teacher extends  Human{
    private String nameObject;

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    public Teacher(String name, String nameObject) {
        super(name);
        this.nameObject = nameObject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподователь с именем " + this.getName());
    }
}
