package javabyherbertschildt.chapter18.thecollectionalgorithms;

// Demonstrate various algorithms.

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {

        // Create and initialize linked list.
        LinkedList<Integer> integers = new LinkedList<>();

        integers.add(-8);
        integers.add(20);
        integers.add(-20);
        integers.add(8);

        // Create a reverse order comparator.
        Comparator reverseOrederComparator = Collections.reverseOrder();

        // Sort list by using the comparator.
        Collections.sort(integers, reverseOrederComparator);

        System.out.println("List sort in reverse: ");
        for (Integer element : integers)
            System.out.print(element + " ");
        System.out.println();

        // Shuffle list.
        Collections.shuffle(integers);

        // Display shuffled list.
        System.out.println("List shuffled: ");
        for (Integer element : integers)
            System.out.print(element + " ");
        System.out.println();

        System.out.println("Minimum: " + Collections.min(integers));
        System.out.println("Maximum: " + Collections.max(integers));
    }
}
