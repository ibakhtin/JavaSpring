package javabyherbertschildt.chapter18.thehashmapclass;

// Demonstrate HashMap collection.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        // Create a hash map
        HashMap<String, Double> hashMap = new HashMap<>();

        // Put elements to the map.
        hashMap.put("John Doe", 3434.34);
        hashMap.put("Tom Smith", 123.22);
        hashMap.put("Jane Baker", 1378.00);
        hashMap.put("Tod Hall", 99.22);
        hashMap.put("Ralph Smith", -19.08);

        // Get a set of the entries.
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        // Display the set.
        for (Map.Entry<String, Double> mapEntry : set)
            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());

        System.out.println();

        // Deposit 1000 into John Doe's account.
        double balance = hashMap.get("John Doe");
        hashMap.put("John Doe", balance + 1000);

        // Display new balance of John Doe.
        System.out.println("John Doe's new balance: " + hashMap.get("John Doe"));
    }
}
