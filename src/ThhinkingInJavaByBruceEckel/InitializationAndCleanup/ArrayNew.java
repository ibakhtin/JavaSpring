package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ibakhtin on 05.03.17.
 */

// Create array with new.

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];

        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
