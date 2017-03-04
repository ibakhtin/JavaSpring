package JavaByHerbertSchildt.Chapter03;

/**
 * Created by ibakhtin on 01.03.17.
 */

// Demonstrate lifetime of a variable.

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (int i = 0; i < 3; i++) {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is: " + y);
        }
    }
}
