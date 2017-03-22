package DataStructuresAndAlgorithmsInJava.Chapter03;

/**
 * Created by ibakhtin on 22.03.17.
 */

class SimpleArray {
    private long[] array;
    private int counter;

    public SimpleArray(int maxSize) {
        array = new long[maxSize];
        counter = 0;
    }

    public SimpleArray add(long item) {
        try {
            this.array[this.counter] = item;
            counter++;
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
            counter--;
        }
        return this;
    }

    public SimpleArray removeAll(long key) {
        while (indexOf(key) != -1) remove(key);
        return this;
    }

    public SimpleArray sort() {
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

    public SimpleArray display() {
        for (int i = 0; i < counter; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
        return this;
    }
}

public class BubbleSortDemoTwo {
    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray(1000);
        simpleArray
                .add(50)
                .add(20)
                .add(80)
                .add(70)
                .add(30)
                .add(60)
                .add(40)
                .add(10)
                .add(30)
                .display()
                .sort()
                .display()
                .removeAll(30)
                .display();

        System.out.println(simpleArray.indexOf(20));
    }
}
