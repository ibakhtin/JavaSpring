package javabyherbertschildt.chapter19.formatter;

// A very simple example that uses Formatter.

import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("Formatter %s is easy %d %f", "with Java", 10, 98.6);

        System.out.println(formatter);
        formatter.close();
    }
}
