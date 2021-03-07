package home_works.hw_2021_02_21.polygon;

public class EquilateralTriangle implements RegularPolygon {

    private int length;

    public EquilateralTriangle(int length) {
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return length;
    }
}
