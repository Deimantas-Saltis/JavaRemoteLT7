package advanced.generics.generic_interface;

public class Motorcycle implements Comparable<Motorcycle> {

    @Override
    public int compareTo(Motorcycle object) {
        return 0;
    }

    @Override
    public Motorcycle getObject() {
        return this;
    }

    // Overload
    public void getSomething(int a) {

    }

    public void getSomething() {

    }

    public void getSomething(int a, String b) {

    }
}
