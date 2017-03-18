package javabyherbertschildt.chapter14.usingwildcardargument;

/**
 * Created by ibakhtin on 16.03.17.
 */

public class Stats<T extends Number> {
    T[] arrayOfNumbers;

    Stats(T[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sum += arrayOfNumbers[i].doubleValue();
        }

        return sum / arrayOfNumbers.length;
    }

    boolean sameAverafe(Stats<?> otherStats) {
        if (this.average() == otherStats.average())
            return true;
        else
            return false;
    }
}
