package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// This program demonstrates the difference
// between public and private.

class TestD {
    int a; // default access
    public int b; // public access
    private int c; // private access

    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        TestD obj = new TestD();

        // These are OK, a and b may be accessed directly
        obj.a = 10;
        obj.b = 20;

        // This is not OK and will cause an error
        // ob.c = 100; // Error!

        // You must access c through its methods
        obj.setC(100);
        System.out.println("a, b, and c: " + obj.a + ", "
                + obj.b + ", " + obj.getC());
    }
}
