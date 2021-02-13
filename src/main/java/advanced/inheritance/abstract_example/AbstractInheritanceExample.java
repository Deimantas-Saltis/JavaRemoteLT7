package advanced.inheritance.abstract_example;

public class AbstractInheritanceExample {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
        Car car1 = new Car("Volvo", 50);
        System.out.println(car1.vehicleMaxSpeed());

        Ship ship = new Ship(6);
        System.out.println(ship.vehicleMaxSpeed());

    }
}
