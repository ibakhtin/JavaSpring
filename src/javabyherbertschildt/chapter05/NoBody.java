package javabyherbertschildt.chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// The target of a loop can be empty.

public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        // find midpoint between i and j
        while(++i < --j);

        System.out.println("Midpoint is " + i);
    }
}
