package javabyherbertschildt.chapter16.stringbuffer;

/**
 * Created by ibakhtin on 20.03.17.
 */

// Demonstrate delete() and deleteCharAt().

public class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is a test.");

        System.out.println("Before delete: " + stringBuffer);

        stringBuffer.delete(4, 7);
        System.out.println("After delete(): " + stringBuffer);

        stringBuffer.deleteCharAt(0);
        System.out.println("After deleteCharAt(): " + stringBuffer);
    }
}
