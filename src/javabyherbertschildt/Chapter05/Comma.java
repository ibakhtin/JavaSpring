package javabyherbertschildt.Chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Using the comma.

public class Comma {
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
