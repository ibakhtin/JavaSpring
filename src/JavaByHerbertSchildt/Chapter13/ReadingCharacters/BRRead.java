package JavaByHerbertSchildt.Chapter13.ReadingCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ibakhtin on 14.03.17.
 */

public class BRRead {
    public static void main(String[] args)
            throws IOException {
        char c;

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, 'q' to quit.");

        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
