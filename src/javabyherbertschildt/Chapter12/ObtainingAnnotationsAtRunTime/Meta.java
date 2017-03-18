package javabyherbertschildt.Chapter12.ObtainingAnnotationsAtRunTime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by ibakhtin on 12.03.17.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String str();
    int val();
}

public class Meta {

    // Annotate a method
    @MyAnnotation(str = "Annotation Example", val = 100)
    public static void myMethod() {
        Meta obj = new Meta();

        try {
            Class<?> c = obj.getClass();

            Method m = c.getMethod("myMethod");

            MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);

            System.out.println(myAnnotation.str() + " " + myAnnotation.val());
        }
        catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
