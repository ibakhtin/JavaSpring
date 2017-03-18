package javabyherbertschildt.chapter15.methodreferencestostaticmethods;

/**
 * Created by ibakhtin on 18.03.17.
 */

// Demonstrate a method reference for a static method.

// A functional interface for string operations.
interface StringFunction {
    String function(String s);
}

// This class defines a static method called strReverse().
class StringOperations {

    // A static method that reverse a string.
    static String stringReverse(String s) {

        String result = "";

        for (int i = s.length() - 1; i >= 0; i--)
            result += s.charAt(i);

        return result;
    }
}

public class MethodReferenceDemo {

    // This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed any instance
    // of that interface, including a method reference.
    static String stringOp(StringFunction stringFunction, String s) {
        return stringFunction.function(s);
    }

    public static void main(String[] args) {

        String inString = "Lambdas add power to Java";
        String outString;

        // Here, a method reference to strReverse is passed to stringOp().
        outString = stringOp(StringOperations::stringReverse, inString);

        System.out.println("Original string: " + inString);
        System.out.println("String reversed: " + outString);
    }
}
