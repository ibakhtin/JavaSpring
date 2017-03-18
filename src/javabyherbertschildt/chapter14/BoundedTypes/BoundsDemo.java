package javabyherbertschildt.chapter14.BoundedTypes;

/**
 * Created by ibakhtin on 16.03.17.
 */

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3, 4, 5 };
        Stats<Integer> integerStats = new Stats<Integer>(integerArray);
        double averageOfIntegerStats = integerStats.average();

        System.out.println("integerStats average is " + averageOfIntegerStats);

        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> doubleStats = new Stats<Double>(doubleArray);
        double averageOfDoubleStats = doubleStats.average();

        System.out.println("doubleStats average is " + averageOfDoubleStats);
    }
}
