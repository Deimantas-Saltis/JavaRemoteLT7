package basics;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionExamples {

    @Test
    public void testAssertEquals() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(5, 115);

        // then
        assertEquals(120, result);
    }

    @Test
    public void testCalculatorSubtraction() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.subtract(5, 115);

        // then
        assertEquals(-110, result);
    }

    @Test
    public void testCalculatorDivision() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.divide(10, 10);

        // then
        assertEquals(1, result);
    }

    @Test
    public void testCalculatorMultiplication() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.multiply(5, 5);

        // then
        assertEquals(25, result);
    }

    @Test
    public void testAssertTrueFalse() {
        // given
        int firstNum = 5;
        int secondNum = 15;

        // when
        boolean condition = firstNum == secondNum;

        // then
        assertTrue(firstNum != secondNum);
        assertFalse(condition);
    }

    @Test
    public void testAssertNulOrNotNull() {
        // given
        String emptyText = null;
        String text = "sekmadienis";

        // when

        // then
        assertNull(emptyText);
        assertNotNull(text);
    }

    @Test
    public void testArrayEquals() {
        // given
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {1, 2, 3};

        // when

        // then
        assertArrayEquals(firstArr, secondArr);
    }

    @Test
    public void testSameOrNotSame() {
        // given
        String text1 = "abc"; // string pool
        String text2 = "abc"; // string pool

        String text3 = new String("abc"); // heap

        // when

        // then
        assertSame(text1, text2);
        assertNotSame(text1, text3);
    }
}
