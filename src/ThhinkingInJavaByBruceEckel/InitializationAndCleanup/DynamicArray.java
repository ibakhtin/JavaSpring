package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 05.03.17.
 */

// Dynamic Array Initialization.

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] { "fiddle", "de", "dum" });
    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
    }
}