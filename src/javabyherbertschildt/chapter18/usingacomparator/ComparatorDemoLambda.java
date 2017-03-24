package javabyherbertschildt.chapter18.usingacomparator;

// Use a custom comparator.

import java.util.TreeSet;

public class ComparatorDemoLambda {
    public static void main(String[] args) {
        // Create a tree set.
        TreeSet<String> strings = new TreeSet<String>((a, b) -> b.compareTo(a));

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
