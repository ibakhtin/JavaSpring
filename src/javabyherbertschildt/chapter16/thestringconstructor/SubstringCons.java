package javabyherbertschildt.chapter16.thestringconstructor;

/**
 * Created by ibakhtin on 19.03.17.
 */

// Construct string from subset of char array.

public class SubstringCons {

    public static void main(String[] args) {

        byte[] ascii = { 65, 66, 67, 68, 69, 70 };

        String stringA = new String(ascii);
        System.out.println(stringA);

        String stringB = new String(ascii, 2, 3);
        System.out.println(stringB);
    }
}
