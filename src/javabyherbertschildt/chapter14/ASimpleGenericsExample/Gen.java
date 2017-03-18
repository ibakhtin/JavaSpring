package javabyherbertschildt.chapter14.ASimpleGenericsExample;

/**
 * Created by ibakhtin on 15.03.17.
 */

// A simple generic class.

public class Gen<T> {
    T genericObject; // declare an object of type T

    // constructor
    Gen(T genericObject) {
        this.genericObject = genericObject;
    }

    // get method
    T getGenericObject() {
        return genericObject;
    }

    // show type of T
    void showTypeOfGenericObject() {
        System.out.println("Type of T is "
                + genericObject.getClass().getName());
    }
}
