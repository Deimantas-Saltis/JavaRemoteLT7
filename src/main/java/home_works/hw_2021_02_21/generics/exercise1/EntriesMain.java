package home_works.hw_2021_02_21.generics.exercise1;

import java.util.Arrays;
import java.util.List;

public class EntriesMain {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "B", "C", "d");
        List<Integer> integers = Arrays.asList(2, 999, 12, -22);

        Entry<String> stringEntry = new Entry<>(strings);
        Entry<Integer> integerEntry = new Entry<>(integers);

        System.out.println(stringEntry.lastEntry());
        System.out.println(integerEntry.firstEntry());
    }
}
