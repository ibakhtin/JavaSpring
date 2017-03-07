package JavaByHerbertSchildt.Chapter08.ASuperclassVariableCanReferenceASubclassObject;

/**
 * Created by ibakhtin on 07.03.17.
 */

// BoxWeight class.

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
