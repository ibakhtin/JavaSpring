package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Exercise 1

class StringContainer {
    String stringValue;
}

public class Exercise01 {
    public static void main(String[] args) {
        StringContainer stringContainer = new StringContainer();
        System.out.println(stringContainer.stringValue);
    }
}
