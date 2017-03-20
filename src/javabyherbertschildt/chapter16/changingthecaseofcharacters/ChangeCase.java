package javabyherbertschildt.chapter16.changingthecaseofcharacters;

/**
 * Created by ibakhtin on 19.03.17.
 */

// Demonstrate toUpperCase() and toLowerCase().

public class ChangeCase {
    public static void main(String[] args) {
        String string = "This is a test.";

        System.out.println("Original: " + string);

        String upper = string.toUpperCase();
        String lower = string.toLowerCase();

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
