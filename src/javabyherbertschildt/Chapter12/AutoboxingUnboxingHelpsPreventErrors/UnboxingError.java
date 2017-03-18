package javabyherbertschildt.Chapter12.AutoboxingUnboxingHelpsPreventErrors;

import java.lang.annotation.*;

/**
 * Created by ibakhtin on 12.03.17.
 */

// An error produced by manual unboxing.

@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Version {
    public int value();
}

@Version(2)
public class UnboxingError {
    public static void main(String[] args) {

        Integer integerObject = 1000;

        int i = integerObject.byteValue();

        System.out.println(i);
    }
}
