package javabyherbertschildt.chapter12.UsingDefaultValues;

import java.lang.reflect.Method;

/**
 * Created by ibakhtin on 13.03.17.
 */

public class MetaFour {

    @MyAnnotation()
    public static void myMethod() {

        MetaFour metaFour = new MetaFour();

        try {
            Method method =
                    metaFour.getClass().getMethod("myMethod");

            MyAnnotation myAnnotation =
                    method.getAnnotation(MyAnnotation.class);

            System.out.println(myAnnotation.description() +
                    " " + myAnnotation.id());
        }
        catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
