package advanced.generics.generic_class.example2;

public class Garage<T extends Vehicle> {

    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void repairVehicle() {
        vehicle.repair();
    }
}
