package javabyherbertschildt.chapter18.usinganiterator;

// Demonstrate iterators.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {

        // Create an array list.
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the array list.
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");

        // Use iterator to display contents of array list.
        System.out.println("Original contents of arrayList:");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        // Modify objects being iterated.
        ListIterator<String> listIterator = arrayList.listIterator();

        while (listIterator.hasNext())
            listIterator.set(listIterator.next() + "+");

        // Display contents of array list.
        System.out.println("Modified contents of arrayList");

        iterator = arrayList.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        // Now, display the list backwards.
        System.out.print("Modified list backwards: ");

        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous() + " ");
        System.out.println();
    }
}
