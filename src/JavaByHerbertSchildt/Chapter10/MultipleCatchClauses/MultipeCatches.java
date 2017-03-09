package JavaByHerbertSchildt.Chapter10.MultipleCatchClauses;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Demonstrate multiple catch statement.

public class MultipeCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = { 1 };
            c[42] = 99;
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks.");
    }
}
