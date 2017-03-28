package javabyherbertschildt.chapter19.formatter;

// Demonstrate left justification.

import java.util.Formatter;

public class LeftJustify {
    public static void main(String args[]) {
        Formatter formatter = new Formatter();

        // Right justify by default
        formatter.format("|%10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();

        // Now, left justify.
        formatter = new Formatter();
        formatter.format("|%-10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();
    }
}
