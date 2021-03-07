package home_works.hw_2021_02_21.shapes;

public class Rectangle extends RightAngleTriangle {

    public Rectangle(String shapeDescription, int width, int height) {
        super(shapeDescription, width, height);
    }

    public int calculateRectangleArea() {
        return height * width;
    }
}
