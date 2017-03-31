package javabyherbertschildt.chapter20.fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStringDemoTwo {
    public static void main(String[] args) {

        String source = "Now is the time for all good men\n"
                + "to come to the aid of their country\n"
                + "and pay their due taxes.";

        byte buf[] = source.getBytes();

        try ( FileOutputStream fileA = new FileOutputStream("fileA.txt");
            FileOutputStream fileB = new FileOutputStream("fileB.txt");
            FileOutputStream fileC = new FileOutputStream("fileC.txt")) {

            // write to first file
            for (int i=0; i < buf.length; i += 2) fileA.write(buf[i]);

            // write to second file
            fileB.write(buf);

            // write to third file
            fileC.write(buf, buf.length-buf.length/4, buf.length/4);
        }
        catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }
    }
}
