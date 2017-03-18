package javabyherbertschildt.chapter10.ThrowOperator;

/**
 * Created by ibakhtin on 09.03.17.
 */

// Demonstrate throw operator.

public class ThrowDemo {
    static void demoMethod() {
        try {
            throw new NullPointerException("Demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside demoMethod: " + e);
            throw e; // rethrow exception
        }
    }

    public static void main(String[] args) {
        try {
            demoMethod();
        }
        catch (NullPointerException e) {
            System.out.println("Recought: " + e);
        }
    }
}
