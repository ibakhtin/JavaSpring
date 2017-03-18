package javabyherbertschildt.chapter15.methodreferencestoinstancemethods;

/**
 * Created by ibakhtin on 18.03.17.
 */

// Demonstrate a method reference to an instance method.

// A functional interface for string operations.
interface StringFunction {
    String function(String s);
}

// Now, this class defines an instance method called strReverse().
class StringOperations {

    String stringReverse(String s) {

        String result = "";

        for (int i = s.length() - 1; i >= 0; i--)
            result += s.charAt(i);

        return result;
    }
}

public class MethodReferenceDemo {

    // This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed any instance
    // of that interface, including method references.
    static String stringOp(StringFunction stringFunction, String s) {
        return stringFunction.function(s);
    }

    public static void main(String[] args) {

        String inString = "Lambdas add power to Java";
        String outString;

        StringOperations stringOperations = new StringOperations();

        // Now, a method reference to the instance
        // method strReverse is passed to stringOp().
        outString = stringOp(stringOperations::stringReverse, inString);

        System.out.println("Original string: " + inString);
        System.out.println("String reversed: " + outString);
    }
}
