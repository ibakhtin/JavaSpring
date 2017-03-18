package javabyherbertschildt.chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Demonstrate method overloading.

public class OverloadDemo2 {
    void test() {
        System.out.println("No parameters");
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + ", " + b);
    }

    // Overload test for a double parameter.
    void test(double a) {
        System.out.println("double a: " + a);
    }

    public static void main(String[] args) {
        OverloadDemo2 overloadDemo = new OverloadDemo2();
        int i = 88;

        overloadDemo.test();
        overloadDemo.test(10, 20);

        overloadDemo.test(i); // this will invoke test(double)
        overloadDemo.test(123.45); // this will invoke test(double)
    }
}
