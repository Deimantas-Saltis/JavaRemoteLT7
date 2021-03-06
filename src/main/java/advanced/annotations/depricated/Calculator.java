package advanced.annotations.depricated;

import java.util.List;

public class Calculator {

    // V1
    @Deprecated
    public int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    // V2
    public int sum(List<Integer> numbers) {
        int result = 0;

        for (Integer number : numbers) {
            result += number;
        }

        return result;
    }
}
