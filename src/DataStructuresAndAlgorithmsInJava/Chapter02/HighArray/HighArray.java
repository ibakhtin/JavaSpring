package DataStructuresAndAlgorithmsInJava.Chapter02.HighArray;

/**
 * Created by ibakhtin on 14.03.17.
 */

// HighArray.java

public class HighArray {
    private long[] a;
    private int nElements;

    public HighArray(int max) {
        a = new long[max];
        nElements = 0;
    }

    public boolean find(long searchKey) {
        int i;

        for (i = 0; i < nElements; i++)
            if (a[i] == searchKey)
                break;
        if (i == nElements) return false;
        else return true;
    }

    public void add(long value) {
        a[nElements] = value;
        nElements++;
    }

    public boolean delete(long value) {
        int i;

        for (i = 0; i < nElements; i++)
            if (a[i] == value) break;

        if (i == nElements)
            return false;
        else {
            for (int k = i; k < nElements; k++)
                a[k] = a[k + 1];
            nElements--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Programming Project 2.1
    public long getMax() {
        long max = -1;

        for (int i = 0; i < nElements; i++)
            if (a[i] > max)
                max = a[i];

        return max;
    }

    // Programming Project 2.2
    public long removeMax() {
        long max = getMax();

        if (max != -1)
            delete(max);

        return max;
    }

    // Programming Projects
    public int length() {
        return nElements;
    }
}
