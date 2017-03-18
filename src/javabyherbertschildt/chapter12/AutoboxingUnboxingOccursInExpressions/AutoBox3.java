package javabyherbertschildt.chapter12.AutoboxingUnboxingOccursInExpressions;

/**
 * Created by ibakhtin on 12.03.17.
 */

// Autoboxing/unboxing occurs inside expressions.

public class AutoBox3 {
    public static void main(String[] args) {

        Integer integerOne, integerTwo;
        int i;

        integerOne = 100;
        System.out.println("Original value of integerOne: "
                + integerOne);

        ++integerOne;

        System.out.println("After ++integerOne: "
                + integerOne);

        integerTwo = integerOne + (integerOne / 3);

        System.out.println("integerTwo after expression: "
                + integerTwo);

        i = integerOne + (integerOne / 3);

        System.out.println("i after expression: " + i);
    }

}
