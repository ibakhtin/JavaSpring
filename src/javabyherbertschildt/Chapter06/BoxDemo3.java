package javabyherbertschildt.Chapter06;

/**
 * Created by ibakhtin on 06.03.17.
 */

// This program includes a method inside the box class.

public class BoxDemo3 {
    public static void main(String[] args) {
        // Declaration of box A
        Box3 boxA = new Box3();

        // Declaration of box B
        Box3 boxB = new Box3();

        // Initialization of box A
        boxA.width = 10;
        boxA.height = 20;
        boxA.depth = 15;

        // Printing volume of box A
        boxA.volume();

        // Initialization of box B
        boxB.width = 3;
        boxB.height = 6;
        boxB.depth = 9;

        // Printing volume of box B
        boxB.volume();
    }
}
