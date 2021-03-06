package advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAntMapExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael", "Brad");

        // Isspausdinti vardus, kurie prasideda raide B
        /*
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).startsWith("B")) {
                System.out.println(names.get(i));
            }
        }
        */

        names.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(name -> System.out.println(name));

        // Paversti vardu sarasa i ju simboliu skaiciu
        /*
        List<Integer> nameLengths = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            nameLengths.add(names.get(i).length());
        }
        */
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .filter(length -> length > 5)
                .map(number -> number * 10)
                .collect(Collectors.toList());
        System.out.println(nameLengths);

        names.stream()
                .filter(name -> name.length() >= 7)
                .forEach(name -> System.out.println(name));
    }
}
