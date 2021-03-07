package home_works.hw_2021_02_21.polygon;

public class RegularPolygonMain {

    public static void main(String[] args) {
        Square square = new Square(4);
        EquilateralTriangle triangle = new EquilateralTriangle(3);

        double angle = square.getInteriorAngle(square.getNumSides());
        int perimeter = square.getPerimeter(square.getNumSides(), square.getSideLength());

        System.out.println("Square angle: " + angle);
        System.out.println("Square perimeter: " + perimeter);

        angle = triangle.getInteriorAngle(triangle.getNumSides());
        perimeter = triangle.getPerimeter(triangle.getNumSides(), triangle.getSideLength());

        System.out.println("Triangle angle: " + angle);
        System.out.println("Triangle perimeter: " + perimeter);
    }
}
