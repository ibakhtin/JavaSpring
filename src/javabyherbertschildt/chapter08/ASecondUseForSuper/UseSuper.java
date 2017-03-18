package javabyherbertschildt.chapter08.ASecondUseForSuper;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Using super to overcome name hiding.

class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B subObj = new B(1, 2);

        subObj.show();
    }
}
