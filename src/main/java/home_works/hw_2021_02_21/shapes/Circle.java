package home_works.hw_2021_02_21.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    public double calculateCircleLength() {
        return (double) 2 * Math.PI * radius;
    }

    public double calculateCircleArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
