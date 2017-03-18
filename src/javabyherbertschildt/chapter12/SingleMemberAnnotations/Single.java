package javabyherbertschildt.chapter12.SingleMemberAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by ibakhtin on 13.03.17.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface SingleMemberAnnotation {
    int value() default 5000;
}

public class Single {

    @SingleMemberAnnotation(8000)
    public static void myMethod() {

        Single single = new Single();

        try {
            Method method =
                    single.getClass().getMethod("myMethod");

            SingleMemberAnnotation annotation =
                    method.getAnnotation(SingleMemberAnnotation.class);

            System.out.println(annotation.value());
        }
        catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
