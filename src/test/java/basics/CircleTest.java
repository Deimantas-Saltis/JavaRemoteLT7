package basics;

import fundamentals_testing.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void shouldCalculateCirclePerimeter() {
        // given
        Circle circle = buildCircle(10);

        // when
        int result = circle.calculateCircleLength();

        // then
        Assertions.assertEquals(62, result);
    }

    @Test
    public void shouldCalculateCircleArea() {
        // given
        Circle circle = buildCircle(1);

        // when
        int result = circle.calculateCircleArea();

        // then
        Assertions.assertEquals(3, result);
    }

    private Circle buildCircle(int radius) {
        return new Circle(radius);
    }
}
