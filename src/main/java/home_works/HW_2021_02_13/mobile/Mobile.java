package home_works.HW_2021_02_13.mobile;

public class Mobile {

    private String model;
    private String manufacturer;
    private double price;

    public Mobile(String model, String manufacturer, double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Mobile{" +
                " model= " + model +
                " manufacturer= " + manufacturer +
                " price= " + price +
                "}";
    }
}
