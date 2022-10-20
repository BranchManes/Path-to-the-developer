package Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void evaluate(Student student) {
        Random r = new Random();
        int value = r.nextInt((3) + 1) + 2;
        String evalauet = " ";
        switch (value) {
            case 2:
                evalauet = "неудовлетворительно";
            case 3:
                evalauet = "удовлетворительно";
            case 4:
                evalauet = "хорошо";
            case 5:
                evalauet = "отлично";

        }
        System.out.println("Преподователь: " + getName() + "," + " оценил(а) студента по имени: " +
                student.getNameStudent() + "," + " по предмету: " + getObject() + "," + " на оценку: " + evalauet);
    }
}

class Student {
    private String studentname;

    public Student(String name) {
        this.studentname = name;
    }

    public String getNameStudent() {
        return studentname;
    }

    public void setNameStudent(String name) {
        this.studentname = name;
    }


}
