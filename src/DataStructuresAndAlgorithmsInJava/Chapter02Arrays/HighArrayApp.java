package DataStructuresAndAlgorithmsInJava.Chapter02Arrays;

/**
 * Created by ibakhtin on 14.03.17.
 */
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray highArray = new HighArray(maxSize);

        highArray.insert(77);
        highArray.insert(99);
        highArray.insert(44);
        highArray.insert(55);
        highArray.insert(22);
        highArray.insert(88);
        highArray.insert(11);
        highArray.insert(00);
        highArray.insert(66);
        highArray.insert(33);

        highArray.display();

        int searchKey = 35;

        if (highArray.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        highArray.delete(00);
        highArray.delete(55);
        highArray.delete(99);

        highArray.display();
    }
}
