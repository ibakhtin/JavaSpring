package javabyherbertschildt.chapter08.MethodOverriding;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Method Overriding

class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B subObj = new B(1,2, 3);

        subObj.show();
    }
}
