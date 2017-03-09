package JavaByHerbertSchildt.Chapter09.Interfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Test Interface

public class TestInterface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient obj = new AnotherClient();

        c.callback(42);

        c = obj;
        c.callback(42);
    }
}
