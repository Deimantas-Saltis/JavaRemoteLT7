package advanced.interfaces.example1;

public interface Shape {

    double getArea();

    double getPerimeter();

    default void printShape() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
    }
}
