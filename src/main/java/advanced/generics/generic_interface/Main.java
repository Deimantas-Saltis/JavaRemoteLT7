package advanced.generics.generic_interface;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(150);
        Car car2 = new Car(50);

        if (car1.compareTo(car2) > 0) {
            System.out.println("car1 is faster");
        }
    }
}
