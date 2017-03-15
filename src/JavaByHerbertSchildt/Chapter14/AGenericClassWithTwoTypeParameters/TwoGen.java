package JavaByHerbertSchildt.Chapter14.AGenericClassWithTwoTypeParameters;

/**
 * Created by ibakhtin on 15.03.17.
 */

// A simple generic class with two type
// parameters: T and V.

public class TwoGen<T, V> {
    T tField;
    V vField;

    // Pass the constructor a reference to
    // an object of type T and an object of type V.
    TwoGen(T tValue, V vValue) {
        tField = tValue;
        vField = vValue;
    }

    // Show types of T and V.
    void showTypeParameters() {
        System.out.println("Type of T is "
                + tField.getClass().getName());
        System.out.println("Type of V is "
                + vField.getClass().getName());
    }

    T gettField() {
        return tField;
    }

    V getvField() {
        return vField;
    }
}
