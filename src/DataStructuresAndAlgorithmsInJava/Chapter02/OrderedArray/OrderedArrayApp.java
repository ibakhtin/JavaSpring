package DataStructuresAndAlgorithmsInJava.Chapter02.OrderedArray;

/**
 * Created by ibakhtin on 20.03.17.
 */

public class OrderedArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrderedArray orderedArray = new OrderedArray(maxSize);

        orderedArray.insert(77);
        orderedArray.insert(99);
        orderedArray.insert(44);
        orderedArray.insert(55);
        orderedArray.insert(22);
        orderedArray.insert(88);
        orderedArray.insert(11);
        orderedArray.insert(00);
        orderedArray.insert(66);
        orderedArray.insert(33);

        int searchKey = 55;
        if (orderedArray.find(searchKey) != orderedArray.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        orderedArray.display();

        orderedArray.delete(00);
        orderedArray.delete(55);
        orderedArray.delete(99);

        orderedArray.display();

        orderedArray.binaryInsert(99);
        orderedArray.binaryInsert(00);
        orderedArray.binaryInsert(55);

        orderedArray.display();
    }

}
