package junit4;

import static java.lang.String.valueOf;

public class GameNumber {
    private int value;

    public GameNumber(int value) {
        this.value = value;
    }

    public String say() {
        int fizz = 3;
        int buzz = 5;

        if (isDivisible(fizz) && isDivisible(buzz)) {
            return "FizzBuzz";
        }
        if (isDivisible(fizz)) {
            return "Fizz";
        }

        if (isDivisible(buzz)) {
            return "Buzz";
        }
        return valueOf(value);
    }

    private boolean isDivisible(int div) {
        return value % div == 0;
    }
}
