package advanced.streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

//         Ar yra bent vienas vardas, kurio ilgis yra > 3
        /*
        boolean isThereANameWhichLengthIsGtThan3 = false;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 3) {
                isThereANameWhichLengthIsGtThan3 = true;
                break;
            }
        }
        */
        boolean isThereANameWhichLengthIsGtThan3 = names.stream()
                .anyMatch(name -> name.length() > 3);
        System.out.println("Ar yra bent vienas vardas, kurio ilgis yra > 3: " + isThereANameWhichLengthIsGtThan3);

        // Ar visu vardu ilgiai yra > 3
        /*
        boolean areAllNameLengthsGtThan3 = false;
        int counter = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 3) {
                counter++;
            }
        }

        if (counter == names.size()) {
            areAllNameLengthsGtThan3 = true;
        }
        */
        boolean areAllNameLengthsGtThan3 = names.stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("Ar visu vardu ilgiai yra > 3: " + areAllNameLengthsGtThan3);
    }
}
