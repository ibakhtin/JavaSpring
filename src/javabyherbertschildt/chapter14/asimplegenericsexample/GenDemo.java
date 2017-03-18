package javabyherbertschildt.chapter14.asimplegenericsexample;

/**
 * Created by ibakhtin on 15.03.17.
 */

// Demonstrate the generic class.

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> integerGen;

        integerGen = new Gen<>(88);

        integerGen.showTypeOfGenericObject();

        int intValue = integerGen.getGenericObject();
        System.out.println("value: " + intValue);

        System.out.println();

        Gen<String> stringGen = new Gen<String>("Generics Test");

        stringGen.showTypeOfGenericObject();

        String stringValue = stringGen.getGenericObject();
        System.out.println("value: " + stringValue);
    }
}
