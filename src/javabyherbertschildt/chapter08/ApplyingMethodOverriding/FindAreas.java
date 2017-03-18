package javabyherbertschildt.chapter08.ApplyingMethodOverriding;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Applying Method Overriding

public class FindAreas {
    public static void main(String[] args) {
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figureReference;

        figureReference = rectangle;
        System.out.println("Area is " + figureReference.area());

        figureReference = triangle;
        System.out.println("Area is " + figureReference.area());

        figureReference = figure;
        System.out.println("Area is " + figureReference.area());
    }
}
