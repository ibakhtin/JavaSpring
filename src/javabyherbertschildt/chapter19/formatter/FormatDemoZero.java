package javabyherbertschildt.chapter19.formatter;

// My Formatter Demo.

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Formatter;

public class FormatDemoZero {
    public static void main(String[] args) {

        Formatter formatter;
        Calendar calendar = Calendar.getInstance();

        formatter = new Formatter();
        formatter.format("Day of week %tA: ", calendar);
        System.out.println(formatter);
        formatter.close();

        System.out.printf("Day of week %tA: ", calendar);
    }
}
