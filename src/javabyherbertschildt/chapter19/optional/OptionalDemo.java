package javabyherbertschildt.chapter19.optional;

// Demonstrate several Optional<T> methods

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> noValue = Optional.empty();

        Optional<String> hasValue = Optional.of("ABCDEF");

        if (noValue.isPresent())
            System.out.println("This won't be displayed");
        else
            System.out.println("noValue has no value");

        if (hasValue.isPresent())
            System.out.println("The string in hasValue is: " + hasValue.get());

        String defaultString = noValue.orElse("Default String");
        System.out.println(defaultString);
    }
}
