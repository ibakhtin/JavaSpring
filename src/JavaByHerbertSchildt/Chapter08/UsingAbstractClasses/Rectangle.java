package JavaByHerbertSchildt.Chapter08.UsingAbstractClasses;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Rectangle class implementation.

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
