package junit4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameNumberTest {

    @Test
    public void should_say_1_when_number_is_1() {
        assertGameNumber(1, "1");
    }


    @Test
    public void should_say_fizz_when_number_is_divided_by_3() {
        assertGameNumber(3, "Fizz");
        assertGameNumber(6, "Fizz");
    }


    @Test
    public void should_say_buzz_when_number_is_divided_by_5() {
        assertGameNumber(5, "Buzz");
        assertGameNumber(10, "Buzz");
    }

    @Test
    public void should_say_fizzbuzz_when_number_is_divided_by_3_and_5() {
        assertGameNumber(15, "FizzBuzz");
        assertGameNumber(45, "FizzBuzz");
    }

    private void assertGameNumber(int num, String said) {
        assertThat(new GameNumber(num).say()).isEqualTo(said);
    }


}
