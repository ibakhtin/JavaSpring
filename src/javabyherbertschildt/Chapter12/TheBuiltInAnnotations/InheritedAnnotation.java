package javabyherbertschildt.Chapter12.TheBuiltInAnnotations;

import java.lang.annotation.*;

/**
 * Created by ibakhtin on 13.03.17.
 */

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.TYPE)
@interface InheritedAnnotation {
    String value() default "Inherited Annotation";
}
