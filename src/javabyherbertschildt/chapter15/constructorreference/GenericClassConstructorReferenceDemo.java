package javabyherbertschildt.chapter15.constructorreference;

/**
 * Created by ibakhtin on 19.03.17.
 */

interface GenericClassConstructorReference<T> {
    GenericBox<T> function(T value);
}

class GenericBox<T> {
    private T value;

    GenericBox(T value) { this.value = value; }

    public T getValue() { return value; }
}

public class GenericClassConstructorReferenceDemo {
    public static void main(String[] args) {
        GenericClassConstructorReference<Integer> genericBoxConstructor =
                GenericBox<Integer>::new;

        GenericBox<Integer> integerGenericBox = genericBoxConstructor.function(1000);

        System.out.println("value in integerGenericBox is " + integerGenericBox.getValue());
    }
}
