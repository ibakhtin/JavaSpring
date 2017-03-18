package javabyherbertschildt.Chapter12.TheBuiltInAnnotations;

/**
 * Created by ibakhtin on 13.03.17.
 */

public class Demo {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        SuperClass superClass = new SuperClass();

        System.out.println(subClass.getClass().getAnnotation(InheritedAnnotation.class).value());
        System.out.println(superClass.getClass().getAnnotation(InheritedAnnotation.class).value());
    }
}
