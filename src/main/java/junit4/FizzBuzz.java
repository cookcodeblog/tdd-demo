package junit4;

import static java.lang.String.valueOf;

public class FizzBuzz {
    public static String of(int input) {
        if (isFizz(input) && isBuzz(input)) {
            return "FizzBuzz";
        }
        if (isFizz(input)) {
            return "Fizz";
        }
        if (isBuzz(input)) {
            return "Buzz";
        }
        return valueOf(input);
    }

    private static boolean isFizz(int input) {
        return isCondition(input, 3);
    }

    private static boolean isCondition(int input, int div) {
        return isDivisible(input, div) || valueOf(input).contains(valueOf(div));
    }


    private static boolean isBuzz(int input) {
        return isCondition(input, 5);
    }

    private static boolean isDivisible(int input, int div) {
        return input % div == 0;
    }
}
