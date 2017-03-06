package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Returning an object.

class TestC {
    int a;

    TestC(int i) {
        a = i;
    }

    TestC incrementByTen() {
        TestC temp = new TestC(a + 10);
        return temp;
    }
}

public class ReturnObject {
    public static void main(String[] args) {
        TestC objA = new TestC(2);
        TestC objB;

        objB = objA.incrementByTen();

        System.out.println("objA.a: " + objA.a);
        System.out.println("objB.a: " + objB.a);

        objB = objB.incrementByTen();

        System.out.println("objB.a after second increment: " + objB.a);
    }
}
