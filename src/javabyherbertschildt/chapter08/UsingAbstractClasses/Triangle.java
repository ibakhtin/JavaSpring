package javabyherbertschildt.chapter08.UsingAbstractClasses;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Triangle class implementation.

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return (dim1 * dim2) / 2;
    }
}
