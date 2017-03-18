package javabyherbertschildt.Chapter08.CreatingAMultilevelHierarchy;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Box class.

class Box {
    double width;
    double height;
    double depth;

    // construct clone of an object
    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
