package basics;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    public void testAssertJMatchers() {
        // given
        String text = "abc";
        String[] textArr = {"abc", "efg", "ogf"};

        // when

        // then
        assertThat(textArr)
                .hasSize(3)
                .contains(text)
                .contains("ogf")
                .doesNotContain("aaaaa");
    }

    @Test
    public void shouldAddTwoNumbers() {
        // given
        int num1 = 5;
        int num2 = -1;

        // when
        int result = num1 + num2;

        // then
        assertThat(result)
                .isEqualTo(4)
                .isNotEqualTo(6)
                .isLessThan(200)
                .isGreaterThan(-10)
                .isBetween(-99, 8);
    }
}
