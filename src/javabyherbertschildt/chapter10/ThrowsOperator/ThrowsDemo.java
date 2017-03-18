package javabyherbertschildt.chapter10.ThrowsOperator;

/**
 * Created by ibakhtin on 09.03.17.
 */

// Demonstrate throws operator.

public class ThrowsDemo {
    static void throwOne()
            throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}
