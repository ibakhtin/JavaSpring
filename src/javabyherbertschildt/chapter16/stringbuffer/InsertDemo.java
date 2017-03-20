package javabyherbertschildt.chapter16.stringbuffer;

/**
 * Created by ibakhtin on 20.03.17.
 */

// Demonstrate insert().

public class InsertDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("I Java!");

        stringBuffer.insert(2, "like ");
        System.out.println(stringBuffer);
    }
}
