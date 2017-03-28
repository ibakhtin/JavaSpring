package javabyherbertschildt.chapter19.formatter;

// Use relative indexes to simplify the
// creation of a custom time and date format.

import java.util.Calendar;
import java.util.Formatter;

public class FormatDemoSix {
    public static void main(String args[]) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        formatter.format("Today is day %te of %<tB, %<tY", calendar);
        System.out.println(formatter);
        formatter.close();
    }
}
