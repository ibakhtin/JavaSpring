package JavaByHerbertSchildt.Chapter13.AutomaticallyClosingAFile;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by ibakhtin on 14.03.17.
 */

// Display a text file.

public class ShowFileFive {
    public static void main(String[] args) {
        int i;

        // First, confirm that a filename has been specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try (FileInputStream fileIS = new FileInputStream(args[0]);) {

            do {
                i = fileIS.read();
                if (i != 1) System.out.print((char) i);
            } while (i != -1);
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
