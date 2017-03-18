package javabyherbertschildt.chapter09.InterfacesCanBeExtended;

/**
 * Created by ibakhtin on 08.03.17.
 */

interface A {
    void methodA();
    void methodB();
}

interface B extends A {
    void methodC();
}

class MyClass implements B {

    public void methodA() {
        System.out.println("Implement methodA.");
    }

    public void methodB() {
        System.out.println("Implement methodB.");
    }

    public void methodC() {
        System.out.println("Implement methodC.");
    }
}

public class IFExtend {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
