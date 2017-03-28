package javabyherbertschildt.chapter19.scanner;

// Use Scanner to compute an average of the values in a file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AvgFile {
    public static void main(String[] args)
            throws IOException {


        int counter = 0;
        double sum = 0.0;

        // Save default locale to defaultLocale
        Locale defaultLocale = Locale.getDefault();
        // Set default locale to en_US
        Locale.setDefault(new Locale("en", "US"));

        // Write output to a file.
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("2 3.4 5 6 7.4 9.1 10.5 done");
        fileWriter.close();

        FileReader fileReader = new FileReader("test.txt");

        Scanner source = new Scanner(fileReader);

        // Read and sum number.
        while (source.hasNext()) {
            if (source.hasNextDouble()) {
                sum += source.nextDouble();
                counter++;
            } else {
                String string = source.next();
                if (string.equals("done")) break;
                else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }
        source.close();
        System.out.println("Average is " + (sum / counter));

        // Restore default locale.
        Locale.setDefault(defaultLocale);
    }
}
