package javabyherbertschildt.Chapter08.UsingAbstractClasses;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Figure class.

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // area is now an abstract method
    abstract double area();
}
