package javabyherbertschildt.chapter20.bufferedinputstream;

// Use buffered input.
// This program uses try-with-resources. It requires JDK 7 or later.

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String string = "This is a &copy; copyright symbol but this is &copy not.\n";
        byte[] buffer = string.getBytes();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(buffer);
        int c;
        boolean marked = false;

        // Use try-with-resources to manage the file.
        try ( BufferedInputStream f = new BufferedInputStream(inputStream) ) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            marked = true;
                            f.mark(32);
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marked) {
                            System.out.print((char) c);
                        }
                        break;
                }
            }
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
