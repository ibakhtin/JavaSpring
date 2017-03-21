package javabyherbertschildt.chapter16.stringbuffer;

/**
 * Created by ibakhtin on 20.03.17.
 */

public class IndexDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("one two one");
        int i;

        i = stringBuffer.indexOf("one");
        System.out.println("First index: " + i);

        i = stringBuffer.lastIndexOf("one");
        System.out.println("Last index: " + i);
    }
}
