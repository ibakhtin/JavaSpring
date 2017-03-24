package javabyherbertschildt.chapter18.vector;

// Demonstrate various vector operations.

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>(3, 2);

        System.out.println("Initial integerVector size: " + integerVector.size());
        System.out.println("Initial integerVector capacity: " + integerVector.capacity());

        integerVector.addElement(1);
        integerVector.addElement(2);
        integerVector.addElement(3);
        integerVector.addElement(4);

        System.out.println("Capacity after four additions: " + integerVector.capacity());

        integerVector.addElement(5);

        System.out.println("Current capacity: " + integerVector.capacity());

        integerVector.addElement(6);
        integerVector.addElement(7);

        System.out.println("Current capacity: " + integerVector.capacity());

        integerVector.addElement(9);
        integerVector.addElement(10);

        System.out.println("Current capacity: " + integerVector.capacity());

        integerVector.addElement(11);
        integerVector.addElement(12);

        System.out.println("First element: " + integerVector.firstElement());
        System.out.println("Last element: " + integerVector.lastElement());

        if (integerVector.contains(3))
            System.out.println("integerVector contain 3.");

        // Enumerate the elements in the vector.
        Enumeration<Integer> vectorEnumeration = integerVector.elements();

        System.out.println("\nElements in vector:");

        while(vectorEnumeration.hasMoreElements())
            System.out.print(vectorEnumeration.nextElement() + " ");

        System.out.println();

        // Display integerVector using for-each loop.
        System.out.println("\nElements in vector:");

        for (Integer element : integerVector)
            System.out.print(element + " ");

        System.out.println();
    }
}
