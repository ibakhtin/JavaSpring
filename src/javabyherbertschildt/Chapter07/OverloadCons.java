package javabyherbertschildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

/*
    Here, Box defines three constructors to initialize
    the dimensions of a box various ways.
*/

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Box boxA = new Box(10, 20, 15);
        Box boxB = new Box();
        Box cube = new Box(7);

        double volume;

        volume = boxA.volume();
        System.out.println("Volume of boxA: " + volume);

        volume = boxB.volume();
        System.out.println("Volume of boxB: " + volume);

        volume = cube.volume();
        System.out.println("Volume of cube: " + volume);
    }
}
