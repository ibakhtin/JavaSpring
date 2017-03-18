package javabyherbertschildt.chapter14.HowGenericsImproveTypeSafety;

/**
 * Created by ibakhtin on 15.03.17.
 */
public class NonGeneric {
    Object objectField;

    NonGeneric(Object object) {
        this.objectField = object;
    }

    Object getObjectField() {
        return objectField;
    }

    void showTypeOfObjectField() {
        System.out.println("Type of objectField is "
                + objectField.getClass().getName());
    }
}
