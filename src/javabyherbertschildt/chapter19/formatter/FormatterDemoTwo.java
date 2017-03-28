package javabyherbertschildt.chapter19.formatter;

// Demonstrate the %f and %e format specifiers.

import java.util.Formatter;

public class FormatterDemoTwo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        for (double i = 1.23; i < 1.0e+6; i *= 100) {
            formatter.format("%f %e -- ", i, i);
            System.out.println(formatter);
        }

        formatter.close();
    }
}
