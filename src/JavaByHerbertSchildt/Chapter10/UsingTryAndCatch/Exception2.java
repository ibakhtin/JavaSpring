package JavaByHerbertSchildt.Chapter10.UsingTryAndCatch;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Using try and catch

public class Exception2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("This won't be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement.");
    }
}
