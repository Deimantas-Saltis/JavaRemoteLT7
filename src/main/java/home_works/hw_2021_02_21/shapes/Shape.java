package home_works.hw_2021_02_21.shapes;

public abstract class Shape {
    protected String shapeDescription;

    public Shape(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }
}
