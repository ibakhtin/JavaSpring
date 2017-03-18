package javabyherbertschildt.chapter09.Interfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Another implementation of Callback.

public class AnotherClient implements Callback {
    // Implement Callback's interface
    public void callback(int p) {
        System.out.println("Another version of callback.");
        System.out.println("p squared is " + (p * p));
    }
}
