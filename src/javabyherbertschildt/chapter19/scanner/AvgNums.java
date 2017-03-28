package javabyherbertschildt.chapter19.scanner;

// Use Scanner to compute an average of the values.

import java.util.Scanner;

public class AvgNums {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Enter numbers to average.");

        // Read and sum number.
        while (consoleInput.hasNext()) {
            if (consoleInput.hasNextDouble()) {
                sum += consoleInput.nextDouble();
                count++;
            }
            else {
                String string = consoleInput.next();
                if (string.equals("done"))
                    break;
                else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }
        consoleInput.close();
        System.out.println("Average is " + sum / count);
    }
}
