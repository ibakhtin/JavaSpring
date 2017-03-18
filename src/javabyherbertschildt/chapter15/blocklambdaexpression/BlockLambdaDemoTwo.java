package javabyherbertschildt.chapter15.blocklambdaexpression;

/**
 * Created by ibakhtin on 18.03.17.
 */

interface StringFunction {
    String function(String s);
}

public class BlockLambdaDemoTwo {
    public static void main(String[] args) {

        StringFunction reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };


        System.out.println("Lambda reversed is " +
                reverse.function("Lambda"));
        System.out.println("Expression reversed is " +
                reverse.function("Expression"));
    }
}
