package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// This program demonstrates the length array member.

public class ArrayLength {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = { 3, 5, 7, 8, 99, 44, -10 };
        int[] a3 = { 4, 3, 2, 1 };

        System.out.println("Length of a1 is " + a1.length);
        System.out.println("Length of a2 is " + a2.length);
        System.out.println("Length of a3 is " + a3.length);
    }
}
