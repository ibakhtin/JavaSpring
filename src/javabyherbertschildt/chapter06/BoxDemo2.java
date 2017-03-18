package javabyherbertschildt.chapter06;

/**
 * Created by ibakhtin on 06.03.17.
 */

// This program declares two Box objects.

public class BoxDemo2 {
    public static void main(String[] args) {
        // Declaration of box A
        Box boxA = new Box();
        double volumeA;

        // Declaration of box B
        Box boxB = new Box();
        double volumeB;

        // Initialization of box A
        boxA.width = 10;
        boxA.height = 20;
        boxA.depth = 15;

        // Computing and printing volume of box A
        volumeA = boxA.width * boxA.height * boxA.depth;
        System.out.println("Volume of box A is " + volumeA);

        // Initialization of box B
        boxB.width = 3;
        boxB.height = 6;
        boxB.depth = 9;

        // Computing and printing volume of box B
        volumeB = boxB.width * boxB.height * boxB.depth;
        System.out.println("Volume of box B is " + volumeB);
    }
}
