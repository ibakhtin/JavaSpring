package javabyherbertschildt.chapter19.formatter;

// // Demonstrate the %n and %% format specifiers.

import java.util.Formatter;

public class FormatDemoThree {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("Copying file%nTransfer is %d%% complete", 88);
        System.out.println(formatter);
        formatter.close();
    }
}
