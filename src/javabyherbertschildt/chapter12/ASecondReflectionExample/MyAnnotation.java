package javabyherbertschildt.chapter12.ASecondReflectionExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by ibakhtin on 13.03.17.
 */


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String stringMember();
    int intMember();
}
