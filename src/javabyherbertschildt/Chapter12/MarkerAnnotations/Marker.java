package javabyherbertschildt.Chapter12.MarkerAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by ibakhtin on 13.03.17.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {}

public class Marker {

    // Annotate a method using a marker.
    // Notice that no () is needed.
    @MyMarker
    public static void myMethod() {
        Marker marker = new Marker();

        try {
            Method method =
                    marker.getClass().getMethod("myMethod");

            if (method.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present.");
            }
        }
        catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
