package javabyherbertschildt.chapter15.somelambdaexpressionexamples;

/**
 * Created by ibakhtin on 18.03.17.
 */

// Demonstrate a lambda expression that takes two parameters.

interface NumericTestTwo {
    boolean test(int i, int d);
}

public class LambdaDemoThree {
    public static void main(String[] args) {

        // This lambda expression determines if one number
        // is a factor of another.
        NumericTestTwo isFactor = (i, d) -> (i % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");

        if (!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
    }
}
