package DataStructuresAndAlgorithmsInJava.Chapter03;

/**
 * Created by ibakhtin on 22.03.17.
 */


public class BubbleSortDemo {
    static <T extends Comparable<T>> void bubleSortOne(T[] array) {
        for (int i = array.length - 1; i > 1 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0)
                    swap(array, j, j + 1);
            }
        }
    }

    private static <T extends Comparable<T>> void swap(T[] array, int indexA, int indexB) {
        T temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    static <T> void display(T[] array) {
        for (T item : array ) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = { 14, 67, 21, 54, 22 };
        display(integers);
        System.out.println();
        bubleSortOne(integers);
        display(integers);

        System.out.println();

        String[] strings = {
                "def",
                "jkl",
                "abc",
                "ghi",
        };
        display(strings);
        System.out.println();
        bubleSortOne(strings);
        display(strings);
    }
}
