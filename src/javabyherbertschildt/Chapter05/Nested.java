package javabyherbertschildt.Chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Loops may be nested.

public class Nested {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
