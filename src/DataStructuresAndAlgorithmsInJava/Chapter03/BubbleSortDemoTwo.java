package DataStructuresAndAlgorithmsInJava.Chapter03;

import java.util.Random;

/**
 * Created by ibakhtin on 22.03.17.
 */

class SimpleArray {
    private long[] array;
    private int counter;

    public SimpleArray(int maxSize) {
        this.array = new long[maxSize];
        this.counter = 0;
    }

    public SimpleArray add(long item) {
        try {
            this.array[this.counter] = item;
            this.counter++;
        } catch (ArrayIndexOutOfBoundsException e) {}
        return this;
    }

    public int indexOf(long key, int first, int last) {
        int middle = (first + last) / 2;

        if (first > last)
            return -1;
        else if (key == this.array[middle])
            return middle;
        else if (key > this.array[middle])
            return indexOf(key, middle + 1, last);
        else
            return indexOf(key, first, middle - 1);
    }

    public int indexOf(long key) {
        return indexOf(key, 0, this.counter - 1);
    }

    public SimpleArray remove(long key) {
        if (indexOf(key) != -1) {
            for (int i = indexOf(key); i < this.counter; i++)
                this.array[i] = this.array[i + 1];
            this.counter--;
        }
        return this;
    }



    public SimpleArray removeAll(long key) {
        while (indexOf(key) != -1) remove(key);
        return this;
    }

    public SimpleArray bubbleSort() {
        for (int i = counter - 1; i > 1 ; i--) {
            for (int j = 0; j < i; j++) {
                if (this.array[j] > this.array[j + 1])
                    swap(j, j + 1);
            }
        }
        return this;
    }

    private void swap(int indexA, int indexB) {
        long temp = this.array[indexA];
        this.array[indexA] = this.array[indexB];
        this.array[indexB] = temp;
    }

    public SimpleArray selectSort() {
        for (int out = 0; out < this.counter; out++) {

            int min = out;

            for (int in = out + 1; in < this.counter; in++)
                if (this.array[in] < this.array[min])
                    min = in;

            swap(out, min);
        }
        return this;
    }

    public SimpleArray display() {
        for (int i = 0; i < this.counter; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
        return this;
    }
}

public class BubbleSortDemoTwo {
    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray(1000);

        for (int i = 0; i < 10; i++)
            simpleArray.add((long) (Math.random() * 90 + 10));

        simpleArray.display().selectSort().display();
    }
}
