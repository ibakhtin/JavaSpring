package JavaByHerbertSchildt.Chapter12.RepeatingAnnotations;

// Demonstrate a repeated annotation.

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Make MyAnnotation repeatable.
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnotations.class)
@interface MyAnnotation {
    String description() default "Testing";
    int value() default 5000;
}

// This is the container annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnotations {
    MyAnnotation[] value();
}

public class RepeatAnnotation {

    // Repeat MyAnnotation on myMethod().
    @MyAnnotation(description = "First Annotation", value = 1000)
    @MyAnnotation(description = "Second Annotation", value = 2000)
    public static void myMethod(String string, int i) {

        RepeatAnnotation repeatAnnotation = new RepeatAnnotation();

        try {
            Class<?> cl = repeatAnnotation.getClass();

            Method method =
                    cl.getMethod("myMethod", String.class, int.class);

            Annotation annotation =
                    method.getAnnotation(MyRepeatedAnnotations.class);

            System.out.println(annotation);
        }
        catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMethod("Test", 10);
    }
}
