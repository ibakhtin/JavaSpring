package javabyherbertschildt.chapter13.ReadingAndWritingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ibakhtin on 14.03.17.
 */

// Display a text file.

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileIS;

        // First, confirm that a filename has been specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // Attempt to open the file.
        try {
            fileIS = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file.");
            return;
        }

        // At this point, the file is open and can be read.
        // The following reads characters until EOF is encountered.
        try {
            do {
                i = fileIS.read();
                if (i != 1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // Close the file.
        try {
            fileIS.close();
        } catch (IOException e) {
            System.out.println("Error closing file.");
        }
    }
}
