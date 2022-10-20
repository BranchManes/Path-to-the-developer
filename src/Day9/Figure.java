package Day9;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimetr();
}

class Circle extends Figure {
    private double circleRadius;

    public Circle(double circleRadius, String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        return Math.abs(Math.pow(circleRadius, 2) * Math.PI);
    }

    @Override
    public double perimetr() {
        return Math.abs((Math.PI * 2 * circleRadius));
    }
}

class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.abs(width * height);
    }

    @Override
    public double perimetr() {
        return (width + height) * 2;
    }
}

class Triangle extends Figure {
    private double a1;
    private double a2;
    private double a3;

    public double perimetr;

    public Triangle(String color, double a1, double a2, double a3) {
        super(color);
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public double perimetr() {
        return a1+a2+a3;
    }

    @Override
    public double area() {
        double health = perimetr()/2;
        return Math.abs(Math.sqrt(health * ((health - a1) * (health - a2) * (health - a3))));
    }


}


class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 20, 30, 10),
                new Triangle("Red", 20, 15, 10),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15, 40),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")

        };

    TestFigures.calculateRedPerimeter(figures);
    TestFigures.calculateRedAria(figures);
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum=0;
        for (Figure f : figures) {
            if (f.getColor().equals("Red")) {
                sum+= f.perimetr();
            }

        }
        System.out.println("Сумма периметров красных фигур: " + sum);
        return sum;
    }

    public static double calculateRedAria(Figure[] figures) {
        double sum1=0;
        for (Figure f : figures) {
            if (f.getColor().equals("Red")) {
                sum1+= f.area();
            }

        }
        System.out.println("Сумма площадей красных фигур: " + sum1);
        return sum1;
    }


}