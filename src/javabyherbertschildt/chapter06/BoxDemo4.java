package javabyherbertschildt.chapter06;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Now, volume() returns the volume of a box.

class Box4 {
    double width;
    double height;
    double depth;

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 boxA = new Box4();
        Box4 boxB = new Box4();
        double volumeA;
        double volumeB;

        // Initializing boxA
        boxA.width = 10;
        boxA.height = 20;
        boxA.depth = 15;

        // Initializing boxB
        boxB.width = 3;
        boxB.height = 6;
        boxB.depth = 9;

        // get volume of boxA
        volumeA = boxA.volume();
        System.out.println("Volume of boxA is " + volumeA);

        // get volume of boxB
        volumeB = boxB.volume();
        System.out.println("Volume of boxB is " + volumeB);
    }
}
