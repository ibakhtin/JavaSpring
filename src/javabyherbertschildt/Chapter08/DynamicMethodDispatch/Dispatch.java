package javabyherbertschildt.Chapter08.DynamicMethodDispatch;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Dynamic Method Dispatch

class A {
    void callMe() {
        System.out.println("Inside A's callMe method");
    }
}

class B extends A {
    // override callMe()
    void callMe() {
        System.out.println("Inside B's callMe method");
    }
}

class C extends A {
    // override callMe()
    void callMe() {
        System.out.println("Inside C's callMe method");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
