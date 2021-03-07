package basics;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExamples {

    @Test
    public void testAssertEquals() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(5, 115);

        // then
        Assertions.assertEquals(120, result);
    }

    @Test
    public void testCalculatorSubtraction() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.subtract(5, 115);

        // then
        Assertions.assertEquals(-110, result);
    }

    @Test
    public void testCalculatorDivision() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.divide(10, 10);

        // then
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testCalculatorMultiplication() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.multiply(5, 5);

        // then
        Assertions.assertEquals(5, result);
    }
}
