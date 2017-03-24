package javabyherbertschildt.chapter18.usingacomparator;

// Use thenComparing() to sort by last, then first name.

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// A comparator that compares last names.
class CompareLastNames implements Comparator<String> {

    @Override
    public int compare(String nameOne, String nameTwo) {
        String lastNameOne = nameOne.substring(nameOne.lastIndexOf(' '));
        String lastNameTwo = nameTwo.substring(nameTwo.lastIndexOf(' '));

        return lastNameOne.compareTo(lastNameTwo);
    }
}

// Sort by entire name when last names are equal.
class CompareFirstNames implements Comparator<String> {
    @Override
    public int compare(String nameA, String nameB) {
        return nameA.compareTo(nameB);
    }
}

public class TreeMapDemoThree {
    public static void main(String[] args) {

        CompareLastNames compareLastNames = new CompareLastNames();
        Comparator<String> compareLastThenFirstNames =
                compareLastNames.thenComparing(new CompareFirstNames());

        TreeMap<String, Double> treeMap = new TreeMap<>(compareLastThenFirstNames);

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
