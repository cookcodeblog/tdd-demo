package junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

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
                {15, "FizzBuzz"},
                {45, "FizzBuzz"},
        });
    }

    public FizzBuzzTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSay() {
        assertEquals(FizzBuzz.of(input), expected);
    }
}
