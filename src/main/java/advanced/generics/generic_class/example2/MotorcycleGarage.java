package advanced.generics.generic_class.example2;

public class MotorcycleGarage {

    private Motorcycle motorcycle;

    public MotorcycleGarage(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public void repairMotorcycle() {
        motorcycle.repair();
    }
}
