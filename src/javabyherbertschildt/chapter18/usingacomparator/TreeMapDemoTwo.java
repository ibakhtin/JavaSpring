package javabyherbertschildt.chapter18.usingacomparator;

// Use a comparator to sort accounts by last name.

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Compare last whole words in two strings.
class TComparator implements Comparator<String> {

    @Override
    public int compare(String aName, String bName) {

        String aLastName = aName.substring(aName.lastIndexOf(' '));
        String bLastName = bName.substring(bName.lastIndexOf(' '));

        int compareResult = aLastName.compareToIgnoreCase(bLastName);

        if (compareResult == 0)
            return aName.compareTo(bName);
        else
            return compareResult;
    }
}

public class TreeMapDemoTwo {
    public static void main(String[] args) {

        TreeMap<String, Double> treeMap = new TreeMap<>(new TComparator());

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
