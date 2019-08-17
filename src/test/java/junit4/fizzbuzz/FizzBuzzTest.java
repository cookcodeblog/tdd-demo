package junit4.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private final int input;
    private final String expected;

    @Parameterized.Parameters(name="should say {1} when number is {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {3, "Fizz"},
                {6, "Fizz"},
                {5, "Buzz"},
                {10, "Buzz"},
                {13, "Fizz"},
                {15, "FizzBuzz"},
                {45, "FizzBuzz"},
                {51, "FizzBuzz"},
                {52, "Buzz"},
                {53, "FizzBuzz"}
        });
    }

    public FizzBuzzTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSay() {
        Assertions.assertThat(FizzBuzz.of(input)).isEqualTo(expected);
    }

}
