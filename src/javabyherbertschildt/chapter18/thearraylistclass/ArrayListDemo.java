package javabyherbertschildt.chapter18.thearraylistclass;

import java.util.ArrayList;

// Demonstrate ArrayList.

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create ArrayList.
        ArrayList<String> stringArrayList = new ArrayList<>();

        System.out.println("Initial size of stringArrayList is " + stringArrayList.size());

        // Add content to stringArrayList.
        stringArrayList.add("C");
        stringArrayList.add("A");
        stringArrayList.add("E");
        stringArrayList.add("B");
        stringArrayList.add("D");
        stringArrayList.add("F");
        stringArrayList.add(1, "A2");

        System.out.println("Size of stringArrayList after additions: " + stringArrayList.size());

        // Display the array list.
        System.out.println("Contents of stringArrayList" + stringArrayList);

        // Remove elements from the array list.
        stringArrayList.remove("F");
        stringArrayList.remove(2);

        System.out.println("Size of stringArrayList after deletions: " + stringArrayList.size());
        System.out.println("Contents of stringArrayList" + stringArrayList);
    }
}
