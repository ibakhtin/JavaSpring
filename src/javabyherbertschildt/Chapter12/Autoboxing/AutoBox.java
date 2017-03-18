package javabyherbertschildt.Chapter12.Autoboxing;

/**
 * Created by ibakhtin on 12.03.17.
 */

// Demonstrate autoboxing/unboxing.

public class AutoBox {

    public static void main(String[] args) {

        Integer iObj = 100; // autoboxing

        int i = iObj; // unboxing

        System.out.println(i + " " + iObj);
    }
}
