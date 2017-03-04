package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 28.02.17.
 */

// InitializationAndCleanup/SimpleConstructor.java
// Demonstration of simple constructor.

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
