package javabyherbertschildt.chapter15.genericfunctionalinterfaces;

/**
 * Created by ibakhtin on 18.03.17.
 */

@interface Main {}

// Use a generic functional interface with lambda expression.

// A generic functional interface.
interface SomeFunction<T> {
    T function(T t);
}

public class GenericFunctionalinterfaceDemo {

    @Main
    public static void main(String[] args) {

        SomeFunction<String> reverse = (s) -> {

            String result = "";

            for (int i = s.length() - 1; i >= 0; i--)
                result += s.charAt(i);

            return result;
        };

        System.out.println("Lambda reversed is " + reverse.function("Lambda"));
        System.out.println("Expression reversed is " + reverse.function("Expression"));

        // Now, use an Integer-based version of SomeFunc.
        SomeFunction<Integer> factorial = (n) ->  {

            int result = 1;

            for(int i=1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factoral of 3 is " + factorial.function(3));
        System.out.println("The factoral of 5 is " + factorial.function(5));
    }
}
