package javabyherbertschildt.chapter15.methodreferenceswithgenerics;

/**
 * Created by ibakhtin on 19.03.17.
 */

// Demonstrate a method reference to a generic method
// declared inside a non-generic class.

// A functional interface that operates on an array
// and a value, and returns an int result.
interface MyFunc<T> {
    int function(T[] values, T value);
}

class ArrayUnils {
    static <T> int countMatching(T[] values, T value) {
        int count = 0;

        for (T t : values)
            if (t == value) count++;

        return count;
    }
}

public class GenericMethodReferenceDemo {

    // This method has the MyFunc functional interface as the
    // type of its first parameter. The other two parameters
    // receive an array and a value, both of type T.
    static <T> int myOp(MyFunc<T> f, T[] values, T value) {
        return f.function(values, value);
    }

    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
        String[] stringArray = { "One", "Two", "Three", "Two" };
        int count;

        count = myOp(ArrayUnils::<Integer>countMatching, integerArray, 4);
        System.out.println("integerArray contain " + count + " 4s");

        count = myOp(ArrayUnils::<String>countMatching, stringArray, "Two");
        System.out.println("stringArray contain " + count + " Twos");
    }
}
