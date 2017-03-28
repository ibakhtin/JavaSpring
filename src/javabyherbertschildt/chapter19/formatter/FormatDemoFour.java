package javabyherbertschildt.chapter19.formatter;

// Demonstrate a field-width specifier.

import java.util.Formatter;

public class FormatDemoFour {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);

        System.out.println(formatter);

        formatter.close();
    }
}
