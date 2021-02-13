package advanced.inheritance.abstract_example;

public class Car extends Vehicle {

    private String model;

    public Car(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed + 20;
    }
}
