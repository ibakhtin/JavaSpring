package Miscelaneous.stream;

// This Application demonstrate Java 8 Features.
// Original article: https://habrahabr.ru/post/216431/

import java.util.stream.IntStream;

public class Java8FeaturesDemo {
    public static void main(String[] args) {
        IntStream.range(50,100).forEach(System.out::println);
    }
}
