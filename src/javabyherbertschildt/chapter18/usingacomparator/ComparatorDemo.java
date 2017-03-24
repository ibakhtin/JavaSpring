package javabyherbertschildt.chapter18.usingacomparator;

// Use a custom comparator.

import java.util.Comparator;
import java.util.TreeSet;

// A reverse comparator for strings.
class MyComparator implements Comparator<String> {

    public int compare(String stringA, String stringB) {
        // Reverse the comparison.
        return stringB.compareTo(stringA);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        // Create a tree set.
        TreeSet<String> strings = new TreeSet<String>(new MyComparator());

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
