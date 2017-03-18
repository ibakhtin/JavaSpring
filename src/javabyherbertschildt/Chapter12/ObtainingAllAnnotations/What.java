package javabyherbertschildt.Chapter12.ObtainingAllAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by ibakhtin on 13.03.17.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}
