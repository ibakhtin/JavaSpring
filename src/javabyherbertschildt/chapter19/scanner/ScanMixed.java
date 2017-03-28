package javabyherbertschildt.chapter19.scanner;

// Use Scanner to read various types of data from a file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanMixed {
    public static void main(String[] args)
            throws IOException {

        int i;
        double d;
        boolean b;
        String s;

        // Change locale to en_US
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(new Locale("en", "US"));

        // Write output to a file.
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("Testing Scanner 10 12.2 one true two false");
        fileWriter.close();

        FileReader fileReader = new FileReader("test.txt");

        Scanner source = new Scanner(fileReader);


        // Read to end.
        while (source.hasNext()) {
            if (source.hasNextInt())
                System.out.println("int: " + source.nextInt());
            else if (source.hasNextDouble())
                System.out.println("double: " + source.nextDouble());
            else if (source.hasNextBoolean())
                System.out.println("boolean: " + source.nextBoolean());
            else
                System.out.println("String: " + source.next());
        }
        source.close();
        // Set locale to default.
        Locale.setDefault(defaultLocale);
    }
}
