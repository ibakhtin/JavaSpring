package javabyherbertschildt.Chapter12.EnumerationFundamentals;

/**
 * Created by ibakhtin on 11.03.17.
 */

public class EnumDemo {
    public static void main(String[] args) {
        Apple apple;

        apple = Apple.RedDel;

        System.out.println("Value of apple: " + apple);
        System.out.println();

        apple = Apple.GoldenDel;

        if (apple == Apple.GoldenDel) {
            System.out.println("apple contains GoldenDel.");
            System.out.println();
        }

        switch (apple) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }
    }
}
