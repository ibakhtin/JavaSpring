package javabyherbertschildt.chapter18.thelinkedhashsetclass;

// Demonstrate LinkedHashSet class.

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // Create a linked hash set.
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the hash set.
        linkedHashSet.add("Beta");
        linkedHashSet.add("Alpha");
        linkedHashSet.add("Eta");
        linkedHashSet.add("Gamma");
        linkedHashSet.add("Epsilon");
        linkedHashSet.add("Omega");

        System.out.println(linkedHashSet);
    }
}
