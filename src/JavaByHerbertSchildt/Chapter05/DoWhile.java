package JavaByHerbertSchildt.Chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Demonstrate the do-while loop.

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("tick " + n);
            n--;
        } while (n > 0);
    }
}
