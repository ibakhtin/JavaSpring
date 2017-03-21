package DataStructuresAndAlgorithmsInJava.Chapter02Arrays;

/**
 * Created by ibakhtin on 20.03.17.
 */

public class BinarySearch {

    static int binarySearchOne(int[] ints, int searchKey) {
        int lowerBound = 0;
        int upperBound = ints.length - 1;
        int currentIndex;

        while(true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (ints[currentIndex] == searchKey)
                return currentIndex;
            else if (lowerBound > upperBound)
                return ints.length;
            else {
                if (ints[currentIndex] < searchKey)
                    lowerBound = currentIndex + 1;
                else
                    upperBound = currentIndex - 1;
            }
        }
    }

    static int binarySearchTwo(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (array[middle] == key) return middle;

            if (array[middle] > key) high = middle - 1;
            else low = middle + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = new int[10000000];

        for (int i = 0; i < 10000000; i++) {
            ints[i] = i + 1;
        }

        System.out.println(ints[binarySearchTwo(ints, 9990)]);
    }
}
