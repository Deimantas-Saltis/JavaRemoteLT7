package advanced.inheritance.abstract_example;

public abstract class Vehicle {

    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
// ctrl + alt + l
    public abstract int vehicleMaxSpeed();
}
