package javabyherbertschildt.chapter09.Interfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Test Interface.

public class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
