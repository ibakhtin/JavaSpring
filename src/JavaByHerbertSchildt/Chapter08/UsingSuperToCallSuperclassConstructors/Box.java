package JavaByHerbertSchildt.Chapter08.UsingSuperToCallSuperclassConstructors;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Box class.

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
