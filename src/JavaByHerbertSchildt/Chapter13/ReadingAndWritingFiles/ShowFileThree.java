package JavaByHerbertSchildt.Chapter13.ReadingAndWritingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ibakhtin on 14.03.17.
 */

// Display a text file.

public class ShowFileThree {
    public static void main(String[] args) {
        int i;
        FileInputStream fileIS = null;

        // First, confirm that a filename has been specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fileIS = new FileInputStream(args[0]);

            do {
                i = fileIS.read();
                if (i != 1) System.out.print((char) i);
            } while (i != -1);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
        finally {
            try {
                if (fileIS != null) fileIS.close();
            }
            catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
