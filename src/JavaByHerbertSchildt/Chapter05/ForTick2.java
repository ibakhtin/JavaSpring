package JavaByHerbertSchildt.Chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Declare a loop control variable inside the for.

public class ForTick2 {
    public static void main(String[] args) {
        // here, n is declared inside of the for loop
        for (int n = 10; n > 0; n--) {
            System.out.println("tick " + n);
        }
    }
}
