package javabyherbertschildt.chapter19.calendar;

// Demonstrate calendar.

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        // Create a calendar initialized with the
        // current date and time in the default
        // locale and timezone.
        Calendar calendar = Calendar.getInstance();

        // Display current time and date information.
        System.out.print("Date: ");
        System.out.print(calendar.get(calendar.YEAR) + " ");
        System.out.print(months[calendar.get(calendar.MONTH)] + " ");
        System.out.println(calendar.get(calendar.DATE));

        System.out.print("Time: ");
        System.out.print(calendar.get(calendar.HOUR) + ":");
        System.out.print(calendar.get(calendar.MINUTE) + ":");
        System.out.println(calendar.get(calendar.SECOND));

        // Set the time and date information and display it.
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 29);
        calendar.set(Calendar.SECOND, 22);

        System.out.print("Updated time: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
