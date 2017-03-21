package DataStructuresAndAlgorithmsInJava.Chapter02Arrays.LowArray;

/**
 * Created by ibakhtin on 14.03.17.
 */

// LowArrayApp.java
//

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr;
        arr = new LowArray(100);
        int nElements = 0;
        int i;

        arr.setElement(0, 77);
        arr.setElement(1, 99);
        arr.setElement(2, 44);
        arr.setElement(3, 55);
        arr.setElement(4, 22);
        arr.setElement(5, 88);
        arr.setElement(6, 11);
        arr.setElement(7, 00);
        arr.setElement(8, 88);
        arr.setElement(9, 33);
        nElements = 10;

        // display items
        for (i = 0; i < nElements; i++) {
            System.out.print(arr.getElement(i) + " ");
        }
        System.out.println();

        // find item
        int searchKey = 26;

        for (i = 0; i < nElements; i++) {
            if (arr.getElement(i) == searchKey)
                break;
        }
        if (i == nElements)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        // delete item
        searchKey = 55;

        for (i = 0; i < nElements; i++) {
            if (arr.getElement(i) == searchKey)
                break;
        }
        for (int k = i; k < nElements; k++) {
            arr.setElement(k, arr.getElement(k + 1));
        }
        nElements--;

        // display items
        for (i = 0; i < nElements; i++) {
            System.out.print(arr.getElement(i) + " ");
        }
        System.out.println();
    } // end of main()
} // end of class LowLevelApp
