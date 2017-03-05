package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

import java.util.Arrays;

/**
 * Created by ibakhtin on 05.03.17.
 */

// Array initialization.

public class ArrayInit {
    public static void main(String[] args) {
        Integer[] integersA = {
                new Integer(1),
                new Integer(2),
                3
        };
        Integer[] integersB = new Integer[] {
                new Integer(1),
                new Integer(2),
                3
        };

        System.out.println(Arrays.toString(integersA));
        System.out.println(Arrays.toString(integersB));
    }
}
