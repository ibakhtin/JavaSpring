package DataStructuresAndAlgorithmsInJava.Chapter02.OrderedArray;

/**
 * Created by ibakhtin on 20.03.17.
 */

public class OrderedArray {
    private long[] a;
    private int nElems;

    public OrderedArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(long value) {
        int j;

        for (j = 0; j < nElems; j++)
            if (a[j] > value)
                break;

        for (int k = nElems; k > j; k--)
            a[k] = a[k - 1];

        a[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);

        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");

        System.out.println();
    }

    // Programming Projects binaryInsert();
    // 1 2 3
    public void binaryInsert(long value) {
        int low = 0;
        int high = nElems - 1;
        int middle = 0;

        while (low <= high) {
            middle = (low + high) / 2;

            if (value > a[middle]) {
                low = middle + 1;
                middle++;
            }
            else high = middle - 1;
        }
        for (int i = nElems; i > middle ; i--)
            a[i] = a[i - 1];
        a[middle] = value;
        nElems++;
    }
}
