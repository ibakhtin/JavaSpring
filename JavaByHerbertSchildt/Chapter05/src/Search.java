/**
 * Created by ibakhtin on 03.03.17.
 */

// Search an array using for-each style for.

public class Search {
    public static void main(String[] args) {
        int[] numbers = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int value = 5;
        boolean found = false;

        // use for-each style for to search numbers for value
        for (int x : numbers) {
            if (x == value) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value found!");
    }
}
