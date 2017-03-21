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

    static int recursiveBinarySearch(int[] array, int key, int firstIndex, int lastIndex) {
        int middleIndex = (firstIndex + lastIndex) / 2;

        if (firstIndex > lastIndex)
            return -1;
        else if (key == array[middleIndex])
            return middleIndex;
        else if (key > array[middleIndex])
            return recursiveBinarySearch(array, key, middleIndex + 1, lastIndex);
        else
            return recursiveBinarySearch(array, key, firstIndex, middleIndex - 1);
    }

    static int recursiveBinarySearch(int[] array, int key) {
        return recursiveBinarySearch(array, key, 0, array.length);
    }

    public static void main(String[] args) {
        int[] ints = new int[100000];

        for (int i = 0; i < 100000; i++) {
            ints[i] = i;
        }

        System.out.println(ints[binarySearchTwo(ints, 90)]);
        System.out.println(ints[recursiveBinarySearch(ints, 99)]);

    }
}
