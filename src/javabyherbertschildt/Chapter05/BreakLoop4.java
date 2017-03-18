package javabyherbertschildt.Chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Using break to exit from nested loops

public class BreakLoop4 {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 3; i++) {
            System.out.println("Pass " + i + ": " );
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;
                System.out.println(j + " ");
            }
            System.out.println("This will not print.");
        }
        System.out.println("Loops complete.");
    }
}
