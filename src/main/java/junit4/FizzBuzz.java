package junit4;

import static java.lang.String.valueOf;

public class FizzBuzz {
    public static String of(int input) {
        int fizz = 3;
        int buzz = 5;
        if (isDivisible(input, fizz) && isDivisible(input, buzz)) {
            return "FizzBuzz";
        }
        if (isDivisible(input, fizz)) {
            return "Fizz";
        }
        if (isDivisible(input, buzz)) {
            return "Buzz";
        }
        return valueOf(input);
    }

    private static boolean isDivisible(int input, int div) {
        return input % div == 0;
    }
}
