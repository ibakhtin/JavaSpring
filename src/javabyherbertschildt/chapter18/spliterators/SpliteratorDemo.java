package javabyherbertschildt.chapter18.spliterators;

// A simple Spliterator demonstration.

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {

        // Create an array list for doubles.
        ArrayList<Double> arrayList = new ArrayList<>();

        // Add values to the array list.
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);

        // Use tryAdvance() to display contents of arrayList.
        System.out.println("Contents of arrayList:");
        Spliterator<Double> spliterator = arrayList.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        // Create new list that contains square roots.
        spliterator = arrayList.spliterator();
        ArrayList<Double> sqrtArrayList = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqrtArrayList.add(Math.sqrt(n))));

        // Use forEachRemaining() to display contents of sqrtArrayList.
        System.out.println("Contents of sqrtArrayList:");
        spliterator = sqrtArrayList.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
