package javabyherbertschildt.chapter15.somelambdaexpressionexamples;

/**
 * Created by ibakhtin on 18.03.17.
 */

interface NumericTest {
    boolean test(int n);
}

public class LambdaDemoTwo {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("10 is even.");
        if (!isEven.test(9)) System.out.println("9 is not even.");

        NumericTest isNotNegative = (n) -> n >= 0;

        if (isNotNegative.test(1)) System.out.println("1 is non-negative.");
        if (!isNotNegative.test(-1)) System.out.println("-1 is negative.");
    }
}
