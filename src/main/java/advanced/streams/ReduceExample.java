package advanced.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

//        "Tom : Brandon : Michael"

        String text = names.stream()
                .reduce("",
                        (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + ": ") + element
                );
        System.out.println(text);

        // 1-a iteracija:  text = "", currentValue = "", element = "Tom"
        // 2-a iteracija:  text = "", currentValue = "Tom", element = "Brandon"
        // 3-ia interacija text = "", currentValue = "Tom: Brandon", element = "Michael"
        // po visu iteraciju text = "Tom: Brandon: Michael"


        int num = names.stream()
                .map(name -> name.length()) // [3, 7, 7]
                .reduce(0,
                        (currentSum, number) -> (number > 3 ? 1 : 0) + currentSum
                );
        System.out.println(num);

        // 1-a iteracija  currentSum = 0; number = 3       currentSum : 0
        // 2-a iteracija  currentSum = 0; number = 7       currentSum : 1
        // 3-ia iteracija currentSum = 1; number = 7       currentSum : 2

        // reduce(pradine reiksme, (sumine/tarpine reiksme, iteruojama reiksme))



        /*
        Su esamu žodžių sąrašu atlikite užduotis:
            * Sujunkite žodžius į vieną naudodami `reduce` funkciją;
            * Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su `map` funkcija ir vėl
            sujunkite į vieną žodį su `reduce`;
            * Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, kiekvieną žodį atskyrę ženklu `,`
            (tekstas negali prasidėti ar baigtis nurodytu ženklu);
              Atfiltruoti zodzius, kurie ilgesni, nei 5 simboliu ilgio;
            * Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę `o`.
            [Rytas, Lova, Durys, Automobilis, Katinas]
        */
        List<String> words = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String concatenatedString = words.stream()
                .reduce("", (concatenatedText, word) -> concatenatedText + word);
        System.out.println(concatenatedString);

        String concatenatedStringInCapital = words.stream()
                .map(word -> word.toUpperCase())
                .reduce("", (concatenatedText, word) -> concatenatedText + word);
        System.out.println(concatenatedStringInCapital);

        String concatenatedWordsWithCommas = words.stream()
                .filter(word -> word.length() > 5)
                .reduce("",
                        (concatenatedText, word) -> (concatenatedText.isEmpty() ? "" : concatenatedText + ", ")  + word
                );
        System.out.println(concatenatedWordsWithCommas);
    }
}
