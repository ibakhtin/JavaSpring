package DataStructuresAndAlgorithmsInJava.Chapter02Arrays.ClassDataArray;

/**
 * Created by ibakhtin on 20.03.17.
 */

public class ClassDataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray classDataArray = new ClassDataArray(maxSize);

        classDataArray.insert("Evans", "Patty", 24);
        classDataArray.insert("Smith", "Lorraine", 37);
        classDataArray.insert("Yee", "Tom", 43);
        classDataArray.insert("Adams", "Henry", 63);
        classDataArray.insert("Hashimoto", "Sato", 21);
        classDataArray.insert("Stimson", "Henry", 29);
        classDataArray.insert("Velasquez", "Jose", 72);
        classDataArray.insert("Lamarque", "Henry", 54);
        classDataArray.insert("Vang", "Minh", 22);
        classDataArray.insert("Creswell", "Lucinda", 18);

        classDataArray.display();

        System.out.println();

        String searchKey = "Stimson";
        Person found = classDataArray.findTwo(searchKey);
        if (found != null) {
            System.out.print("Found: ");
            found.display();
        } else {
            System.out.println("Can't find " + searchKey);
        }

        System.out.println();

        System.out.println("Deleting Smith, Yee, and Creswell");
        classDataArray.delete("Smith");
        classDataArray.delete("Yee");
        classDataArray.delete("Creswell");

        classDataArray.display();
    }
}
