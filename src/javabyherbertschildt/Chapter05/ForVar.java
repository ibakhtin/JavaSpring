package javabyherbertschildt.Chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Parts of the for loop can be empty.

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i is " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
