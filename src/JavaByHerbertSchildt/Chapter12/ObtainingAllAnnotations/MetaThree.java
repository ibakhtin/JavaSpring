package JavaByHerbertSchildt.Chapter12.ObtainingAllAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by ibakhtin on 13.03.17.
 */

@What(description = "An annotation test class")
@MyAnnotation(stringMember = "Testing", intMember = 99)
public class MetaThree {

    @What(description = "An annotation test method")
    @MyAnnotation(stringMember = "Testing", intMember = 100)
    public static void myMethod() {

        MetaThree metaThree = new MetaThree();

        try {
            Annotation[] annotations =
                    metaThree.getClass().getAnnotations();

            System.out.println("All annotations for MetaThree:");

            for (Annotation a : annotations) {
                System.out.println(a);
            }

            System.out.println();

            // Display all annotations for myMethod.
            Method method =
                    metaThree.getClass().getMethod("myMethod");

            annotations = method.getAnnotations();

            System.out.println("All annotations tor myMethod:");

            for (Annotation a : annotations) {
                System.out.println(a);
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
