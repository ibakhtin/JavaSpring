package javabyherbertschildt.chapter14.genericinterfaces;

/**
 * Created by ibakhtin on 17.03.17.
 */

// A generic interface demo.

// A Min/Max interface.
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Now, implements MinMax
class MinMaxClass<T extends Comparable<T>> implements MinMax<T> {

    T[] values;

    MinMaxClass(T[] o) {
        values = o;
    }

    public T min() {

        T value = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(value) < 0) value = values[i];
        }

        return value;
    }

    public T max() {

        T value = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(value) > 0) value = values[i];
        }

        return value;
    }
}

public class GenericInterfacesDemo {
    public static void main(String[] args) {
        Integer[] integerArray = { 3, 6, 2, 8, 6 };
        Character[] characterArray = { 'b', 'r', 'p', 'w' };

        MinMaxClass<Integer> integerObject = new MinMaxClass<>((integerArray));
        MinMaxClass<Character> characterObject = new MinMaxClass<>((characterArray));

        System.out.println("Max value in integerArray: " + integerObject.max());
        System.out.println("Min value in integerArray: " + integerObject.min());
        System.out.println("Max value in characterArray: '" + characterObject.max() + "'");
        System.out.println("Min value in characterArray: '" + characterObject.min() + "'");
    }
}
