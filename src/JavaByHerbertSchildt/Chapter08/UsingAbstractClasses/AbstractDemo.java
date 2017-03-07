package JavaByHerbertSchildt.Chapter08.UsingAbstractClasses;

/**
 * Created by ibakhtin on 07.03.17.
 */

// A Simple demonstration of abstract.

abstract class A {
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is a concrete method.");
    }
}

class B extends A {
    void callMe() {
        System.out.println("B's implementation of callMe.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();

        b.callMe();
        b.callMeToo();
    }
}
