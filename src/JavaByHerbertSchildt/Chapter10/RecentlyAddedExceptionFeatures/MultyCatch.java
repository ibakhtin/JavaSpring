package JavaByHerbertSchildt.Chapter10.RecentlyAddedExceptionFeatures;

/**
 * Created by ibakhtin on 09.03.17.
 */

// Demonstrate the multi-catch feature.

public class MultyCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] c = { 1, 2, 3 };

        try {
            // int result = a / b;

            c[10] = 19;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After multi-catch.");
    }
}
