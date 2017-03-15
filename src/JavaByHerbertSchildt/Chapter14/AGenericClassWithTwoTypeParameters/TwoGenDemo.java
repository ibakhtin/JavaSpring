package JavaByHerbertSchildt.Chapter14.AGenericClassWithTwoTypeParameters;

/**
 * Created by ibakhtin on 16.03.17.
 */

// Demonstrate TwoGen

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen =
                new TwoGen<>(88, "Generics");

        twoGen.showTypeParameters();

        System.out.println();

        int intValue = twoGen.gettField();
        System.out.println("value: " + intValue);

        String stringValue = twoGen.getvField();
        System.out.println("value: " + stringValue);
    }
}
