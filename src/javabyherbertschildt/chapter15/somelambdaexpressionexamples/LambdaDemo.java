package javabyherbertschildt.chapter15.somelambdaexpressionexamples;

/**
 * Created by ibakhtin on 18.03.17.
 */

// A functional interface.

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.45;

        System.out.println("A fixed value: " + myNumber.getValue());

        myNumber = () -> Math.random() * 100;

        System.out.println("A random value: " + myNumber.getValue());
        System.out.println("Another random value: " + myNumber.getValue());
    }
}
