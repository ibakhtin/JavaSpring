package JavaByHerbertSchildt.Chapter08.InheritanceBasics;

/**
 * Created by ibakhtin on 07.03.17.
 */

// A simple example of inheritance.

class A {
    int i, j;

    void showIJ() {
        System.out.println("i and j: " + i + ", " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();

        // The superclass may be used by itself.
        superObj.i = 10;
        superObj.j = 20;
        System.out.println("Content of superObj: ");
        superObj.showIJ();
        System.out.println();

        // The subclass has access to all public
        // members of its superclass.
        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.println("Content of subObj: ");
        subObj.showIJ();
        subObj.showK();
        System.out.println();

        System.out.println("Sum of i, j and k in subObj: ");
        subObj.sum();
    }
}
