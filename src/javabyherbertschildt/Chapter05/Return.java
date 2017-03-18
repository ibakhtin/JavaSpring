package javabyherbertschildt.Chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Demonstrate return.

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before the return.");

        if (t) return; // return to caller

        System.out.println("This won't execute.");
    }
}
