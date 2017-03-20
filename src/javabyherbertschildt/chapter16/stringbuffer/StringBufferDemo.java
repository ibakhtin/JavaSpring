package javabyherbertschildt.chapter16.stringbuffer;

/**
 * Created by ibakhtin on 20.03.17.
 */

// StringBuffer length vs. capacity.

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        System.out.println("buffer = " + stringBuffer);
        System.out.println("length = " + stringBuffer.length());
        System.out.println("capaciti = " + stringBuffer.capacity());
    }
}
