package javabyherbertschildt.chapter20.pushbackinputstream;

// Demonstrate unread().
// This program uses try-with-resources. It requires JDK 7 or later.

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String string = "if (a == 4) a = 0;\n";
        byte[] buf = string.getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(buf);
        int c;

        try ( PushbackInputStream f = new PushbackInputStream(inputStream) )
        {
            while ((c = f.read()) != -1) {
                switch(c) {
                    case '=':
                        if ((c = f.read()) == '=')
                            System.out.print(".eq.");
                        else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break; }
            }
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
