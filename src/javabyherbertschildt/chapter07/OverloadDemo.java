package javabyherbertschildt.chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Demonstrate method overloading.

public class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter.
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + ", " + b);
    }

    // Overload test for a double parameter.
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

    public static void main(String[] args) {
        OverloadDemo overloadDemo = new OverloadDemo();
        double result;

        // call all versions of test()
        overloadDemo.test();
        overloadDemo.test(10);
        overloadDemo.test(10, 20);
        result = overloadDemo.test(123.45);
        System.out.println("Result of overloadDemo.test(123.45): " + result);
    }
}
