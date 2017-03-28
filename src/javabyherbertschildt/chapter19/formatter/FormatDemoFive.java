package javabyherbertschildt.chapter19.formatter;

// Demonstrate the space format specifiers.

import java.util.Formatter;

public class FormatDemoFive {
    public static void main(String args[]) {
        Formatter formatter = new Formatter();

        formatter.format("% d", -100);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("% d", 100);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("% d", -200);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("% d", 200);
        System.out.println(formatter);
        formatter.close();
    }
}
