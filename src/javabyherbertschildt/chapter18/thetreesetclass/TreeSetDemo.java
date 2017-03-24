package javabyherbertschildt.chapter18.thetreesetclass;

// Demonstrate TreeSet class.

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Create an instance of TreeSet.
        TreeSet<String> strings = new TreeSet<>();

        // Add elements to the strings.
        strings.add("E");
        strings.add("C");
        strings.add("B");
        strings.add("A");
        strings.add("D");

        // Display the strings.
        System.out.println(strings);
    }

}
