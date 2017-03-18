package javabyherbertschildt.Chapter12.JavaEnumerationsAreClassTypes;

/**
 * Created by ibakhtin on 12.03.17.
 */

public class EnumDemoThree {
    public static void main(String[] args) {
        Apple apple;

        System.out.println("Winsap costs "
                + Apple.Winesap.getPrice()
                + " cents.\n");

        System.out.println("All apple prices: ");
        for (Apple a : Apple.values()) {
            System.out.println(a + " costs "
                    + a.getPrice() + " cents.");
        }
    }
}
