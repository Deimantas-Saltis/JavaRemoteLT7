package advanced.generics.generic_interface;

public interface Comparable<T> {

    int compareTo(T object);

    T getObject();
}
