package javabyherbertschildt.Chapter06;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Here, Box uses a constructor to initialize
// the dimensions of a box.


class Box6 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box6() {
        System.out.println("Constructing Box.");
        width = 10;
        height = 10;
        depth = 10;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 boxA = new Box6();
        Box6 boxB = new Box6();

        // get volume of each box
        System.out.println("Volume of boxA is " + boxA.volume() + ".");
        System.out.println("Volume of boxB is " + boxB.volume() + ".");
    }
}
