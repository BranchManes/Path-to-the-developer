package Day1;

public class Student {
    int numberS,yearStudy;
    double sredMath;
    double sredEconomics;
    double sredIn;
    double count;
    String name,surname;
    Student(int numbers,int yearStudy,double sredMath,double sredEconomics,double sredIn,String name,String surname){
        this.numberS =numbers;
        this.yearStudy = yearStudy;
        this.sredMath = sredMath;
        this.sredEconomics = sredEconomics;
        this.sredIn = sredIn;
        this.name = name;
        this.surname = surname;
    }
    public void sredArith( Student student){
        count = (sredMath+sredEconomics+sredIn)/3;
        System.out.println("Средняя арифметическая оценка ученика за три предмеа:"+count);
    }

}
class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(230, 4, 4.5, 3.2, 4.3, "Jhon", "Hij");
        Student s2 = new Student(560, 3, 5, 3.3, 4, "Katrin", "Jamanta");
        Student s3 = new Student(350, 1, 4.4, 4, 5, "Nick", "Valentai");
        s3.sredArith(s3);
    }
}