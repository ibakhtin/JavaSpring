package javabyherbertschildt.chapter14.genericmethods;

/**
 * Created by ibakhtin on 16.03.17.
 */

// Demonstrate a simple generic method.

public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3, 4, 5 };

        if(isIn(2, integerArray))
            System.out.println("2 is in integerArray");

        if(!isIn(7, integerArray))
            System.out.println("7 is not in integerArray");

        System.out.println();

        String[] stringArray = { "one", "two", "three", "four", "five" };

        if(isIn("two", stringArray))
            System.out.println("'two' is in stringArray");

        if(!isIn("seven", stringArray))
            System.out.println("'seven' is not in stringArray");
    }
}

