package home_works.hw_2021_02_21.company;

public class Device {

    private String name;
    private double price;
    private int quantity;
    private String description;

    public Device(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Pavadinimas %s, kaina %.02f", name, price);
    }
}
