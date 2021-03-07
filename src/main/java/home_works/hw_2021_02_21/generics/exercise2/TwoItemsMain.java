package home_works.hw_2021_02_21.generics.exercise2;

public class TwoItemsMain {

    public static void main(String[] args) {

        // String tipo
        TwoItems<String> twoNames = new TwoItems<>("Jonas", "Petras");

        String name1 = twoNames.getEntry1();
        String name2 = twoNames.getEntry2();

        System.out.printf(" First item: %s.%n", name1);
        System.out.printf(" Second item: %s.%n", name2);
        System.out.println(twoNames.toString());

        // Sveiko skaiciaus tipo
        TwoItems<Integer> twoNums = new TwoItems<>(12, 44);

        int num1 = twoNums.getEntry1();
        int num2 = twoNums.getEntry2();

        System.out.printf(" First item: %s.%n", num1);
        System.out.printf(" Second item: %s.%n", num2);
        System.out.println(twoNums.toString());
    }
}
