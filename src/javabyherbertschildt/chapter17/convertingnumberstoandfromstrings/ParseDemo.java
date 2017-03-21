package javabyherbertschildt.chapter17.convertingnumberstoandfromstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  This program sums a list of numbers entered
//  by the user.  It converts the string representation
//  of each number into an int using parseInt().

public class ParseDemo {
    public static void main(String[] args)
            throws IOException {

        // create a BufferedReader using System.in
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        String string;
        int i;
        int sum = 0;

        System.out.println("Enter numbers, 0 to quit.");
        do {
            string = bufferedReader.readLine();
            try {
                i = Integer.parseInt(string);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format. Try again.");
                i = 1;
                continue;
            }
            sum += i;
            System.out.println("Current sum is " + sum);
        } while (i != 0);
    }
}
