package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ibakhtin on 05.03.17.
 */

// Creating an array of nonprimitive objects.

public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];

        System.out.println("length of a = " + a.length);

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100000);
        }

        System.out.println(Arrays.toString(a));
    }
}
