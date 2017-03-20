package javabyherbertschildt.chapter16.stringconversion;

/**
 * Created by ibakhtin on 19.03.17.
 */

class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String toString() {
        return "Dimension are: " + width + " by "
                + height + " by " + depth;
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 15);
        String string = "Box box: " + box.toString();

        System.out.println(box);
        System.out.println(string);
    }
}
