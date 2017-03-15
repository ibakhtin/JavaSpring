package JavaByHerbertSchildt.Chapter14.HowGenericsImproveTypeSafety;

/**
 * Created by ibakhtin on 15.03.17.
 */

// NonGenericDemo.java

public class NonGenericDemo {
    public static void main(String[] args) {
        NonGeneric integerNonGeneric;

        integerNonGeneric = new NonGeneric(88);

        integerNonGeneric.showTypeOfObjectField();

        int intValue = (Integer) integerNonGeneric.getObjectField();
        System.out.println("value: " + intValue);

        System.out.println();

        NonGeneric stringNonGeneric =
                new NonGeneric("Non-Generic Test");

        stringNonGeneric.showTypeOfObjectField();

        String stringValue = (String) stringNonGeneric.getObjectField();
        System.out.println("value: " + stringValue);

        integerNonGeneric = stringNonGeneric;
        intValue = (Integer) integerNonGeneric.getObjectField();
    }

}
