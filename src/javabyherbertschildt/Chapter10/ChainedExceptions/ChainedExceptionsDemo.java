package javabyherbertschildt.Chapter10.ChainedExceptions;

/**
 * Created by ibakhtin on 09.03.17.
 */

// Demonstrate exception chaining.

public class ChainedExceptionsDemo {
    static void demoMethod() {
        // create exception
        NullPointerException exception =
                new NullPointerException("top layer");

        // add cause
        exception.initCause(new ArithmeticException("cause"));

        throw exception;
    }

    public static void main(String[] args) {
        try {
            demoMethod();
        }
        catch (NullPointerException e) {

            // display top level exception
            System.out.println("Caught: " + e);

            // display cause exception
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
