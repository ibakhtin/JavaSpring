package javabyherbertschildt.chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Using break as a civilized form of goto.

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Before the breah.");
                    if (t) break second;
                }
                System.out.println("This won't execute.");
            }
            System.out.println("This is after second block.");
        }
    }
}
