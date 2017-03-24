package javabyherbertschildt.chapter18.arrays;

// Demonstrate Arrays.

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++)
            intArray[i] = -3 * i;

        System.out.println("Original contents: ");
        display(intArray);
        Arrays.sort(intArray);
        System.out.println("Sorted array: ");
        display(intArray);

        Arrays.fill(intArray, 2, 6, -1);
        System.out.println("After fill: ");
        display(intArray);

        Arrays.sort(intArray);
        System.out.println("After sorting again: ");
        display(intArray);

        System.out.print("The value -9 is at location ");
        int index = Arrays.binarySearch(intArray, -9);
        System.out.println(index);
    }

    static void display(int[] intArray) {
        for (int element : intArray)
            System.out.print(element + " ");
        System.out.println();
    }
}
