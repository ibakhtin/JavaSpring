package javabyherbertschildt.chapter06;

/**
 * Created by ibakhtin on 06.03.17.
 */

// This program uses a parameterized method.

class Box5 {
    double width;
    double height;
    double depth;

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 boxA = new Box5();
        Box5 boxB = new Box5();

        // initialize each box
        boxA.setDim(10, 20, 15);
        boxB.setDim(3, 6, 9);

        // get volume of each box
        System.out.println("Volume of boxA is " + boxA.volume());
        System.out.println("Volume of boxB is " + boxB.volume());
    }
}
