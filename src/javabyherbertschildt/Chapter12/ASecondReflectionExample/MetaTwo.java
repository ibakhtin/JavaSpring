package javabyherbertschildt.Chapter12.ASecondReflectionExample;

import java.lang.reflect.Method;

/**
 * Created by ibakhtin on 13.03.17.
 */

public class MetaTwo {

    // myMethod now has two arguments.
    @MyAnnotation(stringMember = "Two Parameters", intMember = 19)
    public static void myMethod(String str, int i) {

        MetaTwo metaTwoObject = new MetaTwo();

        try {
            Class<?> cl = metaTwoObject.getClass();

            Method method = cl.getMethod("myMethod", String.class, int.class);

            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

            System.out.println(myAnnotation.stringMember() + " " + myAnnotation.intMember());
        }
        catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMethod("Test", 1024);
    }
}
