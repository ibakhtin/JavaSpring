package javabyherbertschildt.chapter13.UsingAssert;

/**
 * Created by ibakhtin on 15.03.17.
 */

// Demonstrate assert.

public class AssertDemo {
    static int value = 3;

    // return an integer
    static int getNumber() {
        return value--;
    }

    public static void main(String[] args) {
        int number;

        for (int i = 0; i < 10; i++) {
            number = getNumber();

            assert number > 0 : "n is negative";

            System.out.println("number is " + number);
        }
    }
}
