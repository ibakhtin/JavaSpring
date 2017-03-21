package DataStructuresAndAlgorithmsInJava.Chapter02Arrays.LowArray;

/**
 * Created by ibakhtin on 14.03.17.
 */

// LowArray.java
// demonstrates array class with low-level interface

public class LowArray {
    private long[] a;

    // constructor
    public LowArray(int size) {
        a = new long[size];
    }

    // set value
    public void setElement(int index, long value) {
        a[index] = value;
    }

    // get value
    public long getElement(int index) {
        return a[index];
    }
}
