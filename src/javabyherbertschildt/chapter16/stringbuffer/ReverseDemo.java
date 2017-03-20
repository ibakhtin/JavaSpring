package javabyherbertschildt.chapter16.stringbuffer;

/**
 * Created by ibakhtin on 20.03.17.
 */

// Demonstrate reverse().

public class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("abcdef");

        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
