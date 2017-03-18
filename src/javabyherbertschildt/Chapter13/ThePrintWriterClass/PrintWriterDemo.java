package javabyherbertschildt.Chapter13.ThePrintWriterClass;

import java.io.PrintWriter;

/**
 * Created by ibakhtin on 14.03.17.
 */

// Demonstrate PrintWriter.

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter printWriter =
                new PrintWriter(System.out, true);

        printWriter.println("This is string.");

        int i = -7;
        printWriter.println(i);

        double d = 4.5e-7;
        printWriter.println(d);
    }
}
