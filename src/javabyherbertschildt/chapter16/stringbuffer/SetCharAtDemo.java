package javabyherbertschildt.chapter16.stringbuffer;

/**
 * Created by ibakhtin on 20.03.17.
 */

// Demonstrate charAt() and setCharAt().

public class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        System.out.println("stringBuffer before: " + stringBuffer);
        System.out.println("charAt(1) before: " + stringBuffer.charAt(1));

        stringBuffer.setCharAt(1, 'i');
        stringBuffer.setLength(2);

        System.out.println("stringBuffer after: " + stringBuffer);
        System.out.println("charAt(1) after: " + stringBuffer.charAt(1));
    }
}
