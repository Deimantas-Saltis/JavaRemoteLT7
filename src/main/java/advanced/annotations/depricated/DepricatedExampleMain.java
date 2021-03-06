package advanced.annotations.depricated;

import java.util.Arrays;
import java.util.List;

public class DepricatedExampleMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(11, 100);

        System.out.println(result);

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        result = calculator.sum(numbers);

        System.out.println(result);
    }
}
