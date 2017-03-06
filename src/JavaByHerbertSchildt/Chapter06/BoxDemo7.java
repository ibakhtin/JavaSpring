package JavaByHerbertSchildt.Chapter06;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Parameterized constructor.

class Box7 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 boxA = new Box7(10, 20, 15);
        Box7 boxB = new Box7(3, 6, 9);

        // get volume of each box
        System.out.println("Volume of boxA is " + boxA.volume() + ".");
        System.out.println("Volume of boxB is " + boxB.volume() + ".");
    }
}
