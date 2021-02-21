package advanced.generics.generic_class.example1;

public class Car {

    private int engine;

    public Car(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
