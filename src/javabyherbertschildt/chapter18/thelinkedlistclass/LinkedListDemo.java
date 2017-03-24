package javabyherbertschildt.chapter18.thelinkedlistclass;

import javax.print.DocFlavor;
import java.util.LinkedList;

// Demonstrate LinkedList class.

public class LinkedListDemo {
    public static void main(String[] args) {

        // Create a linked list.
        LinkedList<String> strings = new LinkedList<>();

        // Add elements to the linked list.
        strings.add("F");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.addFirst("A");
        strings.addLast("Z");

        strings.add(1, "A2");

        System.out.println("Original contents of strings: " + strings);

        strings.remove("F");
        strings.remove(2);

        System.out.println("Contents of strings after deletion: " + strings);

        // Remove first snd last items.
        strings.removeFirst();
        strings.removeLast();

        System.out.println("strings after deleting first and last: " + strings);

        // Get and set value.
        String value = strings.get(2);
        strings.set(2, value + " Changed");

        System.out.println("strings after changing: " + strings);
    }
}
