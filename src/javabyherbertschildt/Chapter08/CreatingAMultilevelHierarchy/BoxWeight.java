package javabyherbertschildt.Chapter08.CreatingAMultilevelHierarchy;

/**
 * Created by ibakhtin on 07.03.17.
 */

// BoxWeight class.

class BoxWeight extends Box {
    double weight;

    // construct clone of an object
    BoxWeight(BoxWeight boxWeight) {
        super(boxWeight);
        weight = boxWeight.weight;
    }

    // constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    // constructor used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
