package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 04.03.17.
 */

// NoSynthesis class.

class Bird2 {
    Bird2(int i) {}
    Bird2(double d) {}
}

public class NoSynthesis {
    public static void main(String[] args) {
        Bird2 b1 = new Bird2(1);
        Bird2 b2 = new Bird2(1.1);
    }
}
