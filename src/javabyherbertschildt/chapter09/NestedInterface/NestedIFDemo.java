package javabyherbertschildt.chapter09.NestedInterface;

/**
 * Created by ibakhtin on 08.03.17.
 */

// A nested interface example.

// This class contains a member interface.
class A {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// B implements the nested interface.
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
        // IB return x >= 0;
    }
}

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");

        if(nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
