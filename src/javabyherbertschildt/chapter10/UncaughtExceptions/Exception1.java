package javabyherbertschildt.chapter10.UncaughtExceptions;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Uncaught Exceptions

public class Exception1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        Exception1.subroutine();
    }
}
