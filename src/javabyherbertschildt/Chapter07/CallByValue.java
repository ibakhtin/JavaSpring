package javabyherbertschildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Primitive types are passed by value.

class TestA {
    void method(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        TestA obj = new TestA();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + ", " + b);

        obj.method(a, b);

        System.out.println("a and b after call: " + a + ", " + b);
    }
}
