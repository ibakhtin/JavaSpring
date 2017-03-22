package DataStructuresAndAlgorithmsInJava.Chapter02.ClassDataArray;

/**
 * Created by ibakhtin on 20.03.17.
 */

public class ClassDataArray {
    private Person[] personArray;
    private int counter;

    public ClassDataArray(int maxSize) {
        personArray = new Person[maxSize];
        counter = 0;
    }

    // Авторская имплементация линейного поиска.
    public Person find(String searchLastName) {
        int i;

        for (i = 0; i < counter; i++) {
            if (personArray[i].getLastName().equals(searchLastName))
                break;
        }

        if (i == counter)
            return null;
        else
            return personArray[i];
    }

    // Моя имплементация линейного поиска.
    public Person findTwo(String searchingLastName) {
        for (int i = 0; i < counter; i++) {
            if (personArray[i].getLastName().equals(searchingLastName)) {
                return personArray[i];
            }
        }
        return null;
    }

    public void insert(String lastName, String firsName, int age) {
        personArray[counter++] = new Person(firsName, lastName, age);
    }

    public boolean delete(String deletingLastName) {
        for (int i = 0; i < counter; i++) {
            if (personArray[i].getLastName().equals(deletingLastName)) {
                for (int j = i; j < counter; j++) {
                    personArray[j] = personArray[j + 1];
                }
                counter--;
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < counter; i++) {
            personArray[i].display();
        }
    }
}
