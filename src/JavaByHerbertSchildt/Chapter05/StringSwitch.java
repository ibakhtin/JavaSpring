package JavaByHerbertSchildt.Chapter05;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Use a string to control a switch statement.

public class StringSwitch {
    public static void main(String[] args) {
        String string = "two";

        switch(string) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
