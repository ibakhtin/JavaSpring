package javabyherbertschildt.chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Demonstrate an inner class.

class Outer {
    int outerX = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is inner class
    class Inner {
        void display() {
            System.out.println("display: outerX = " + outerX);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
