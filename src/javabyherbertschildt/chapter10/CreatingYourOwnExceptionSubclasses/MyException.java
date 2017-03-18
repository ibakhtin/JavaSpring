package javabyherbertschildt.chapter10.CreatingYourOwnExceptionSubclasses;

/**
 * Created by ibakhtin on 09.03.17.
 */

class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
