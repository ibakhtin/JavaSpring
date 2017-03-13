package JavaByHerbertSchildt.Chapter12.TypeAnnotations;

// Demonstrate several type annotation.

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// A marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface TypeAnnotation {}

// Another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface NotZeroLength {}

// Still another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface Unique {}

// A parameterized annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface MaxLength {
    int value();
}

// An annotation that can be applied to a type parameter.
@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}
// An annotation that can be applied to a field declaration.
@Target(ElementType.FIELD)
@interface EmptyOk {}

// An annotation that can be applied to a method declaration.
@Target(ElementType.METHOD)
@interface Recomended {}

// Use an annotation on a type parameter.
public class TypeAnnotationDemo<@What(description = "Generic data type") T> {

    // Use type annotation on a constructor.
    public @Unique TypeAnnotationDemo() {}

    // Annotate the type (in this case String), not the field.
    @TypeAnnotation String string;

    // This annotates the field test.
    @EmptyOk String test;

    // Use a type annotation to annotate this (the receiver).
    public int f(@TypeAnnotation TypeAnnotationDemo<T> this, int x) {
        return 10;
    }

    // Annotate the return type.
    public @TypeAnnotation Integer f2(int i, int j) {
        return i + j;
    }

    // Annotate the method declaration.
    public @Recomended Integer f3(String string) {
        return string.length() / 2;
    }

    // Use a type annotation with a throws clause.
    public void f4() throws @TypeAnnotation NullPointerException {
        // ...
    }

    // Annotate array levels.
    String @MaxLength(10) [] @NotZeroLength [] w;

    // Annotate the array element type.
    @TypeAnnotation Integer[] vector;

    public static void myMethod(int i) {

        // Use a type annotation on a type argument.
        TypeAnnotationDemo<@TypeAnnotation Integer> typeAnnotationDemoA =
                new TypeAnnotationDemo<@TypeAnnotation Integer>();

        // Use a type annotation with new.
        @Unique TypeAnnotationDemo<Integer> typeAnnotationDemoB =
                new @Unique TypeAnnotationDemo<Integer>();

        Object x = new Integer(10);
        Integer y;

        // Use a type annotation on a cast.
        y = (@TypeAnnotation Integer) x;
    }

    public static void main(String[] args) {
        myMethod(10);
    }

    // Use type annotation with inheritance clause.
    class SomeClass extends @TypeAnnotation TypeAnnotationDemo<Boolean> {}
}
