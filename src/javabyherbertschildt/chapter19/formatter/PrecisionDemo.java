package javabyherbertschildt.chapter19.formatter;

// Demonstrate the precision modifier.

import java.util.Formatter;

public class PrecisionDemo {
    public static void main(String args[]) {
        Formatter formatter = new Formatter();

        // Format 4 decimal places.
        formatter.format("%.4f", 123.1234567);
        System.out.println(formatter);
        formatter.close();

        // Format to 2 decimal places in a 16 character field
        formatter = new Formatter();
        formatter.format("%16.2e", 123.1234567);
        System.out.println(formatter);
        formatter.close();

        // Display at most 15 characters in a string.
        formatter = new Formatter();
        formatter.format("%.15s", "Formatting with Java is now easy.");
        System.out.println(formatter);
        formatter.close();
    }
}
