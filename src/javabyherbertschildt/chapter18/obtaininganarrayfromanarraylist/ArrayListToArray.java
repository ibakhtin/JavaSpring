package javabyherbertschildt.chapter18.obtaininganarrayfromanarraylist;

// Convert an ArrayList into an array.

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        System.out.println("Contents of integerArrayList " + integerArrayList);

        Integer[] integerArray = new Integer[integerArrayList.size()];
        integerArray = integerArrayList.toArray(integerArray);

        int sum = 0;

        for (int i : integerArray)
            sum += i;

        System.out.println("sum is: " + sum);
    }
}
