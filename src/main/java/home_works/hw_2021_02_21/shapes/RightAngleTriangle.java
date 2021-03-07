package home_works.hw_2021_02_21.shapes;

public class RightAngleTriangle extends Shape {

    protected int width;
    protected int height;

    public RightAngleTriangle(String shapeDescription, int width, int height) {
        super(shapeDescription);
        this.width = width;
        this.height = height;
    }

    public double calculateRightAngleRectangleArea() {
        return (double) height * width / 2;
    }
}
