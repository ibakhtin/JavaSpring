package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

class TestB {
    int a, b;

    TestB(int i, int j) {
        a = i;
        b = j;
    }

    void method(TestB obj) {
        obj.a *= 2;
        obj.b /= 2;
    }
}

public class PassObjRef {
    public static void main(String[] args) {
        TestB obj = new TestB(15, 20);

        System.out.println("obj.a and obj.b before call: "
                + obj.a + ", " + obj.b);

        obj.method(obj);

        System.out.println("obj.a and obj.b after call: "
                + obj.a + ", " + obj.b);
    }
}
