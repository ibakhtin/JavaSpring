package JavaByHerbertSchildt.Chapter03;

/**
 * Created by ibakhtin on 01.03.17.
 */

// Demonstrate dynamic initialization.

public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse is " + c);
    }
}
