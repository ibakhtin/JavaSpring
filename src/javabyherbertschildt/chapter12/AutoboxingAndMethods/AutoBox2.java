package javabyherbertschildt.chapter12.AutoboxingAndMethods;

/**
 * Created by ibakhtin on 12.03.17.
 */

//  Autoboxing/unboxing takes place with
//  method parameters and return values.

public class AutoBox2 {

    //  Take an Integer parameter and return an int value.
    static  int method(Integer value) {
        return value;
    }

    public static void main(String[] args) {
        // Pass an int to method() and assign the return value
        // to an Integer.  Here, the argument 100 is autoboxed
        // into an Integer.  The return value is also autoboxed
        // into an Integer.
        Integer iObj = method(100);

        System.out.println(iObj);
    }
}
