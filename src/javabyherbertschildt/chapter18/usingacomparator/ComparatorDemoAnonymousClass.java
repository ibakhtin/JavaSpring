package javabyherbertschildt.chapter18.usingacomparator;

// Use a custom comparator.

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemoAnonymousClass {
    public static void main(String[] args) {
        // Create a tree set.
        TreeSet<String> strings = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        // Add elements to the tree set.
        strings.add("C");
        strings.add("A");
        strings.add("B");
        strings.add("E");
        strings.add("D");

        // Display the elements.
        for (String element : strings)
            System.out.print(element + " ");
        System.out.println();

    }
}
