package advanced.generics.generic_class.example2;

public class CarGarage {

    private Car car;

    public CarGarage(Car car) {
        this.car = car;
    }

    public void repairCar() {
        car.repair();
    }
}
