package javabyherbertschildt.chapter18.thetreemapclass;

// Demonstrate TreeMap collection.

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<String, Double> treeMap = new TreeMap<>();

        // Put elements to the map.
        treeMap.put("John Doe", 3434.34);
        treeMap.put("Tom Smith", 123.22);
        treeMap.put("Jane Baker", 1378.00);
        treeMap.put("Tod Hall", 99.22);
        treeMap.put("Ralph Smith", -19.08);

        // Get a set of the entries.
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        // Display the set.
        for (Map.Entry<String, Double> mapEntry : set)
            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());

        System.out.println();

        // Deposit 1000 into John Doe's account.
        double balance = treeMap.get("John Doe");
        treeMap.put("John Doe", balance + 1000);

        // Display new balance of John Doe.
        System.out.println("John Doe's new balance: " + treeMap.get("John Doe"));
    }
}
