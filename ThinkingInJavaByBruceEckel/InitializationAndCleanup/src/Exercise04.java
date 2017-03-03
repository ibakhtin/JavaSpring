/**
 * Created by ibakhtin on 03.03.17.
 */

// Exercise 4

class SampleClass04 {
    SampleClass04() {
        System.out.println("Hello from default constructor.");
    }

    SampleClass04(String string) {
        System.out.println(string);
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        new SampleClass04();
        new SampleClass04("Hello from overloaded constructor.");
    }
}
