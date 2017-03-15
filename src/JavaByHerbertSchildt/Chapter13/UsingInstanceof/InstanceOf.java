package JavaByHerbertSchildt.Chapter13.UsingInstanceof;

/**
 * Created by ibakhtin on 15.03.17.
 */

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {

        // creating instances of classes
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) System.out.println("a is instance of A");
        if (b instanceof B) System.out.println("b is instance of B");
        if (c instanceof C) System.out.println("c is instance of C");
        if (c instanceof A) System.out.println("c is instance of A");
        if (a instanceof C) System.out.println("a is instance of C");

        System.out.println();

        A referenceToA;

        referenceToA = d;

        System.out.println("referenceToA now refers to d");

        if (referenceToA instanceof D) System.out.println("referenceToA is instance of D");

        System.out.println();

        referenceToA = c;

        System.out.println("referenceToA now refers to C");

        if (referenceToA instanceof D) System.out.println("referenceToA can be cast to D");
        else System.out.println("referenceToA cannot be cast to D");

        if (referenceToA instanceof A) System.out.println("referenceToA can be cast to A");

        System.out.println();

        if (a instanceof Object) System.out.println("a may be cast to Object");
        if (b instanceof Object) System.out.println("b may be cast to Object");
        if (c instanceof Object) System.out.println("c may be cast to Object");
        if (d instanceof Object) System.out.println("d may be cast to Object");
    }
}
