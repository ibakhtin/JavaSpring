package javabyherbertschildt.chapter14.genericconstructors;

/**
 * Created by ibakhtin on 17.03.17.
 */

class GenericConstructor {

    private double value;

    <T extends Number> GenericConstructor(T argument) {
        value = argument.doubleValue();
    }

    void showValue() {
        System.out.println(value);
    }
}

public class GenericConstructorsDemo {

    public static void main(String[] args) {

        GenericConstructor genericConstructorA =
                new GenericConstructor(100);
        GenericConstructor genericConstructorB =
                new GenericConstructor(123.45f);

        genericConstructorA.showValue();
        genericConstructorB.showValue();
    }
}
