package javabyherbertschildt.chapter19.scanner;

// Use Scanner to compute an average a list
// of comma-separated values.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SetDelimiters {
    public static void main(String[] args) throws IOException {

        int counter = 0;
        double sum = 0.0;

        // Change default locale to en_US
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(new Locale("en", "US"));

        // Write output to a file.
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("2, 3.6,     5.4,7.2, 10, 6.6, done");
        fileWriter.close();

        FileReader fileReader = new FileReader("test.txt");

        Scanner source = new Scanner(fileReader);

        source.useDelimiter(", *");

        while (source.hasNext()) {
            if (source.hasNextDouble()) {
                sum += source.nextDouble();
                counter++;
            } else {
                String string = source.next();
                if (string.equals("done"))
                    break;
                else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }
        source.close();
        System.out.printf("Average is %f", sum / counter);
        Locale.setDefault(defaultLocale);
    }
}
