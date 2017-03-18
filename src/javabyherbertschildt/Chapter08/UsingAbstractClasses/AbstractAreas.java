package javabyherbertschildt.Chapter08.UsingAbstractClasses;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Using abstract methods and classes.

public class AbstractAreas {
    public static void main(String[] args) {
        // Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figureReference;

        figureReference = rectangle;
        System.out.println("Area is " + figureReference.area());

        figureReference = triangle;
        System.out.println("Area is " + figureReference.area());
    }
}
