package javabyherbertschildt.chapter20.fileoutputstream;

// Demonstrate FileOutputStream

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {

        String source = "Now is the time for all good men\n"
                + "to come to the aid of their country\n"
                + "and pay their due taxes.";

        byte buf[] = source.getBytes();

        FileOutputStream fileA = null;
        FileOutputStream fileB = null;
        FileOutputStream fileC = null;

        try {
            fileA = new FileOutputStream("fileA.txt");
            fileB = new FileOutputStream("fileB.txt");
            fileC = new FileOutputStream("fileC.txt");

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
        finally {
            try {
                if(fileA != null) fileA.close();
            }
            catch(IOException e) {
                System.out.println("Error Closing fileA.txt");
            }
            try {
                if(fileB != null) fileB.close();
            }
            catch(IOException e) {
                System.out.println("Error Closing fileB.txt");
            }
            try {
                if(fileC != null) fileC.close();
            }
            catch(IOException e) {
                System.out.println("Error Closing fileC.txt");
            }
        }
    }
}
