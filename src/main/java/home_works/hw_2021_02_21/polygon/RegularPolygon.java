package home_works.hw_2021_02_21.polygon;

public interface RegularPolygon {

    int getNumSides();

    int getSideLength();

    default int getPerimeter(int n, int length) {
        return n * length;
    }

    default double getInteriorAngle(int n) {
        return (n - 2) * 180;
    }
}
