package javabyherbertschildt.chapter19.date;

// Show date and time using only Date methods.

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        // Instantiate date object.
        Date date = new Date();

        // Display date.
        System.out.println(date);

        // Display number of milliseconds since midnight, January 1, 1970 GMT
        long milliSeconds = date.getTime();
        System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + milliSeconds);
    }
}
