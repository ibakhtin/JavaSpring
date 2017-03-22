package DataStructuresAndAlgorithmsInJava.Chapter02.HighArray;

/**
 * Created by ibakhtin on 14.03.17.
 */
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray highArrayA = new HighArray(maxSize);
        HighArray highArrayB = new HighArray(maxSize);

        highArrayA.add(77);
        highArrayA.add(99);
        highArrayA.add(44);
        highArrayA.add(55);
        highArrayA.add(22);
        highArrayA.add(88);
        highArrayA.add(11);
        highArrayA.add(00);
        highArrayA.add(66);
        highArrayA.add(33);

        highArrayA.display();


        int searchKey = 35;

        if (highArrayA.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        highArrayA.delete(00);
        highArrayA.delete(55);

        highArrayA.display();

        // Programming Projects
        System.out.println("\nProgramming Projects\n");

        long maxItem = highArrayA.getMax();

        if (maxItem != -1)
            System.out.println("Max item of highArrayA is " + maxItem);

        System.out.println("Array after remove max element " + highArrayA.removeMax());

        highArrayA.display();

        while (highArrayA.length() > 0) {
            highArrayB.add(highArrayA.removeMax());
        }

        highArrayB.display();
    }
}
