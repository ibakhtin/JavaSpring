package javabyherbertschildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */


class Box2 {
    double width;
    double height;
    double depth;

    Box2(Box2 box2) {
        width = box2.width;
        height = box2.height;
        depth = box2.depth;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 boxA = new Box2(10, 20, 15);
        Box2 boxB = new Box2();
        Box2 cube = new Box2(7);

        Box2 boxC = new Box2(boxA);

        double volume;

        volume = boxA.volume();
        System.out.println("Volume of boxA: " + volume);

        volume = boxB.volume();
        System.out.println("Volume of boxB: " + volume);

        volume = cube.volume();
        System.out.println("Volume of cube: " + volume);

        volume = boxC.volume();
        System.out.println("Volume of boxC: " + volume);
    }
}
