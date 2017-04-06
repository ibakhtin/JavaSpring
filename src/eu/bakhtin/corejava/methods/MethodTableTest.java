package eu.bakhtin.corejava.methods;

import java.lang.reflect.Method;

/**
 * This program shows how to invoke methods through reflection.
 * @author Igor Bakhtin
 */
public class MethodTableTest
{
    public static void main(String[] args) throws Exception
    {
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    public static double square(double value)
    {
        return value * value;
    }

    /**
     *
     * @param from
     * @param to
     * @param n
     * @param method
     */
    public static void printTable(double from, double to, int n, Method method)
    {
        System.out.println(method);

        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx)
        {
            try
            {
                double y = (Double) method.invoke(null, x);
                System.out.printf("%10.4f    %10.4f%n", x, y);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
