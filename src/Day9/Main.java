package Day9;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan","Blue");
        Teacher teacher = new Teacher("Helena","Biology");
        System.out.println(student.getNameStadyGroup());
        System.out.println(teacher.getNameObject());
        student.printInfo();
        teacher.printInfo();
    }
}
