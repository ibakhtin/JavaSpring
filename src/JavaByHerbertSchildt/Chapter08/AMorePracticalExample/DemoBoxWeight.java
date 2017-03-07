package JavaByHerbertSchildt.Chapter08.AMorePracticalExample;

/**
 * Created by ibakhtin on 07.03.17.
 */


class Box {
    double width;
    double height;
    double depth;

    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

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

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight boxA = new BoxWeight(10, 20, 15, 34);
        BoxWeight boxB = new BoxWeight(2, 3, 4, 0.075);
        double volume;

        volume = boxA.volume();
        System.out.println("Volume of boxA is " + volume);
        System.out.println("Weight of boxA is " + boxA.weight);
        System.out.println();

        volume = boxB.volume();
        System.out.println("Volume of boxB is " + volume);
        System.out.println("Weight of boxB is " + boxB.weight);
    }
}
