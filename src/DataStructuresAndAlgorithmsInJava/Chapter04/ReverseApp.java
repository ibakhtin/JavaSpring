package DataStructuresAndAlgorithmsInJava.Chapter04;

// ReverseApp.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class ReverseApp {
    public static void main(String[] args) throws IOException {

        String input, output;

        while (true) {
            System.out.println("Enter a string: ");
            // System.out.flush();

            input = getString();
            if (input.equals(""))
                break;
            Reverser reverser = new Reverser(input);
            System.out.println("Reversed: " + reverser.apply());
        }

    }

    static String getString() throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        return bufferedReader.readLine();
    }
}
