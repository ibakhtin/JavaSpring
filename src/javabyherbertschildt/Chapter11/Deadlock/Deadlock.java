package javabyherbertschildt.Chapter11.Deadlock;

/**
 * Created by ibakhtin on 11.03.17.
 */

class A {

    synchronized void foo(B b) {

        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo()");

        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("A Interrupted");
        }

        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last()");
    }
}

class B {

    synchronized void bar(A a) {

        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar()");

        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("B Interrupted");
        }

        System.out.println(name + " trying to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.last()");
    }
}

public class Deadlock implements Runnable {

    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("MainThread");
        Thread thread = new Thread(this, "RacingThread");
        thread.start();

        a.foo(b);
        System.out.println("Back to main thread");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
