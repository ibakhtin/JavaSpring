/**
 * Created by ibakhtin on 03.03.17.
 */

// Exercise 2

class StringsContainer {
    String stringA = "String A";
    String stringB;
    StringsContainer() {
        stringB = "String B";
    }
}
public class Exercise02 {
    public static void main(String[] args) {
        StringsContainer stringsContainer = new StringsContainer();
        System.out.println(stringsContainer.stringA);
        System.out.println(stringsContainer.stringB);
    }
}
