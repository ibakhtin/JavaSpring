package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Objects may be passed to methods.

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

public class PassObject {
    public static void main(String[] args) {
        Test objA = new Test(100, 22);
        Test objB = new Test(100, 22);
        Test objC = new Test(-1, -1);

        System.out.println("objA == objB: " + objA.equalTo(objB));
        System.out.println("objA == objC: " + objA.equalTo(objC));
    }
}
