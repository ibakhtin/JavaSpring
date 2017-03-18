package javabyherbertschildt.chapter15.lambdaexpressionsandexceptions;

/**
 * Created by ibakhtin on 18.03.17.
 */

interface DoubleNumericArrayFunction {
    double function(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array Empty");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = { 1.0, 2.0, 3.0, 4.0, 5.0 };

        DoubleNumericArrayFunction average = (doubleArray) -> {
            double sum = 0;

            if (doubleArray.length == 0)
                throw new EmptyArrayException();

            for (double arrayItem : doubleArray)
                sum += arrayItem;

            return sum / doubleArray.length;
        };

        System.out.println("The average is: " + average.function(values));
        System.out.println("The average is: " + average.function(new double[0]));
    }
}
