package javabyherbertschildt.chapter15.blocklambdaexpression;

/**
 * Created by ibakhtin on 18.03.17.
 */

interface NumericFunction {
    long function(long n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {

        // This block lambda computes the factorial of an int value.
        NumericFunction factorial = (n) -> {
            long result = 1;

            for (int i = 1; i < n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("The factorial of 5 is " + factorial.function(5));
        System.out.println("The factorial of 10 is " + factorial.function(10));
    }
}
