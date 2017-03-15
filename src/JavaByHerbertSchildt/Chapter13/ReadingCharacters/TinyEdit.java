package JavaByHerbertSchildt.Chapter13.ReadingCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ibakhtin on 14.03.17.
 */

// A Tiny editor.

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[100];

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'quit' to quit.");

        for (int i = 0; i < 100; i++) {
            strings[i] = bufferedReader.readLine();
            if (strings[i].equals("quit")) break;
        }
        System.out.println("\nHere is your file: ");
        for (int i = 0; i < 100; i++) {
            if (strings[i].equals("quit")) break;
            System.out.println(strings[i]);
        }
    }
}
