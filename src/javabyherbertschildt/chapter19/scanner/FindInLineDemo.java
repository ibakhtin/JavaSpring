package javabyherbertschildt.chapter19.scanner;

// Demonstrate findInLine().

import java.util.Scanner;

public class FindInLineDemo {
    public static void main(String[] args) {
        String string = "Name: Tom Age: 28 ID: 77";
        Scanner scanner = new Scanner(string);

        scanner.findInLine("Age:");

        if (scanner.hasNext())
            System.out.println(scanner.next());
        else
            System.out.println("Error!");
    }
}
