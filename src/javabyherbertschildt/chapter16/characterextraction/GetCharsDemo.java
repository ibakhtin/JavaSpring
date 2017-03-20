package javabyherbertschildt.chapter16.characterextraction;

/**
 * Created by ibakhtin on 19.03.17.
 */

// Demonstrate getChars().

class GetCharsDemo {
    public static void main(String args[]) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];

        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
