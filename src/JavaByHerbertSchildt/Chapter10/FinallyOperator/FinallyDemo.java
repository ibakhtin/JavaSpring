package JavaByHerbertSchildt.Chapter10.FinallyOperator;

/**
 * Created by ibakhtin on 09.03.17.
 */

// Demonstrate finally.

public class FinallyDemo {
    static void methodA() {
        try {
            System.out.println("inside methodA");
            throw new RuntimeException("demo");
        }
        finally {
            System.out.println("methodA's finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("inside methodB");
            return;
        }
        finally {
            System.out.println("methodB's finally");
        }
    }

    static void methodC() {
        try {
            System.out.println("inside methodC");
        }
        finally {
            System.out.println("methodC's finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        }
        catch (Exception e) {
            System.out.println("Exception caught" + e);
        }

        methodB();
        methodC();
    }
}
