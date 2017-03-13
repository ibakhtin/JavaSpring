package JavaByHerbertSchildt.Chapter12.EnumerationFundamentals;

/**
 * Created by ibakhtin on 11.03.17.
 */

public class EnumDemoTwo {

    public static void main(String[] args) {

        Apple apple;

        System.out.println("Here are all Apple constants:");

        Apple[] apples = Apple.values();

        for (Apple a : apples) {
            System.out.println(a);
        }

        System.out.println();

        apple = Apple.valueOf("Winesap");
        System.out.println("apple contains " + apple);
    }
}
