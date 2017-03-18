package javabyherbertschildt.chapter14.usingwildcardargument;

/**
 * Created by ibakhtin on 16.03.17.
 */

// Demonstrate wildcard.

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3, 4, 5 };
        Stats<Integer> integerStats = new Stats<>(integerArray);
        double averageOfIntegerStats = integerStats.average();
        System.out.println("integerStats average is " + averageOfIntegerStats);

        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> doubleStats = new Stats<>(doubleArray);
        double averageOfDoubleStats = doubleStats.average();
        System.out.println("doubleStats average is " + averageOfDoubleStats);

        Float[] floatArray = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f };
        Stats<Float> floatStats = new Stats<>(floatArray);
        double averageOfFloatStats = floatStats.average();
        System.out.println("floatStats average is " + averageOfFloatStats);

        System.out.println();

        System.out.print("Average of integerArray and doubleArray is ");
        if (integerStats.sameAverafe(doubleStats))
            System.out.println("are the same.");
        else
            System.out.println("differ.");

        System.out.print("Average of integerArray and floatArray is ");
        if (integerStats.sameAverafe(floatStats))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
    }
}
