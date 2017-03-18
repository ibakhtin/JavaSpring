package javabyherbertschildt.chapter13.ReadingAndWritingFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ibakhtin on 14.03.17.
 */

// CopyFile.java

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        // First, confirm that a filename has been specified.
        if (args.length != 2) {
            System.out.println("Usage: ShowFile from to");
            return;
        }

        try {
            // Attempt to open the files.
            fileIn = new FileInputStream(args[0]);
            fileOut = new FileOutputStream(args[1]);

            do {
                i = fileIn.read();
                if (i != -1) fileOut.write(i);
            } while (i != -1);
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        finally {
            try {
                if (fileIn != null) fileIn.close();
            }
            catch (IOException e2) {
                System.out.println("Error closing input file.");
            }
            try {
                if (fileOut != null) fileOut.close();
            }
            catch (IOException e2) {
                System.out.println("Error closing output file.");
            }
        }
    }
}
