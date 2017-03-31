package Miscelaneous.lambdaexpresions;

//

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

class WithLambdaMethod {


}

public class LambdaMethodDemo {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("one", "two", "three");
        Function<String, String> capitalize = string ->
                string.substring(0, 1).toUpperCase() + string.substring(1, string.length());
        stringStream
                .map(capitalize::apply)
                .forEach(System.out::println);
    }
}
