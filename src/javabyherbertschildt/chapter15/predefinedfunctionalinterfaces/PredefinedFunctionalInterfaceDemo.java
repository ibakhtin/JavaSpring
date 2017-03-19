package javabyherbertschildt.chapter15.predefinedfunctionalinterfaces;

import java.util.function.Function;

/**
 * Created by ibakhtin on 19.03.17.
 */

// Use the Function built-in functional interface.

public class PredefinedFunctionalInterfaceDemo {

    public static void main(String[] args) {

        // This block lambda computes the factorial of an int value.
        // This time, Function is the functional interface.
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result *= i;

            return result;
        };

        System.out.println("The factoral of 8 is " + factorial.apply(8));
        System.out.println("The factoral of 16 is " + factorial.apply(16));
    }
}
