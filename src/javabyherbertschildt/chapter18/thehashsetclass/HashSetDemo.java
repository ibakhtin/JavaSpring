package javabyherbertschildt.chapter18.thehashsetclass;

// Demonstrate the HashSet class.

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        // Create a hash set.
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the hash set.
        hashSet.add("Beta");
        hashSet.add("Alpha");
        hashSet.add("Eta");
        hashSet.add("Gamma");
        hashSet.add("Epsilon");
        hashSet.add("Omega");

        System.out.println(hashSet);
    }
}
