package home_works.hw_2021_02_13.car;

public class Car {
    private String model;
    private int engine;
    private int year;
    private double price;
    private String type;

    public Car(String model, int engine, int year, double price, String type) {
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public int getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return String.format("%s %i", this.model, this.year);
    }
}
