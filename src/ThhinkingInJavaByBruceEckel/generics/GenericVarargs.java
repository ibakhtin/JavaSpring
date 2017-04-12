package ThhinkingInJavaByBruceEckel.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Igor Bakhtin
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        return Arrays.asList(args);
    }

    public static void main(String[] args) {
        List<String> stringList = makeList("A");
        System.out.println(stringList);

        stringList = makeList("A", "B", "C");
        System.out.println(stringList);

        stringList = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(stringList);
    }
}
