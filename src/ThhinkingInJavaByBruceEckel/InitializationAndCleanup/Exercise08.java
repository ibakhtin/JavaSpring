package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Exercise 8

class SampleClass08 {
    void method1() {
        System.out.println("method1");
    }

    void method2() {
        this.method1();
        method1();
    }
}

public class Exercise08 {
    public static void main(String[] args) {
        SampleClass08 obj = new SampleClass08();
        obj.method2();
    }
}
