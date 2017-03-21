package javabyherbertschildt.chapter17.understandingisinfiniteandisnan;

/**
 * Created by ibakhtin on 21.03.17.
 */

// Demonstrate isInfinite() and isNaN()

public class InfNaN {
    public static void main(String[] args) {
        Double d1 = new Double(1 / 0.0);
        Double d2 = new Double(0 / 0.0);

        System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
        System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
    }
}
