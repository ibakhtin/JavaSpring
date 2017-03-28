package javabyherbertschildt.chapter19.formatter;

// Formatting date and time.

import java.util.Calendar;
import java.util.Formatter;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        // Display standard 12-hour time format.
        formatter.format("%tr", calendar);
        System.out.println(formatter);
        formatter.close();

        // Display complete date and time information.
        formatter = new Formatter();
        formatter.format("%tc", calendar);
        System.out.println(formatter);
        formatter.close();

        // Display just hour and minute.
        formatter = new Formatter();
        formatter.format("%tl:%tM", calendar, calendar);
        System.out.println(formatter);
        formatter.close();

        // Display month by name and number.
        formatter = new Formatter();
        formatter.format("%tB %tb %tm", calendar, calendar, calendar);
        System.out.println(formatter);
        formatter.close();
    }
}
