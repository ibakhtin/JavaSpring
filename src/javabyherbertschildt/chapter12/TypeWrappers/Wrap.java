package javabyherbertschildt.chapter12.TypeWrappers;

/**
 * Created by ibakhtin on 12.03.17.
 */
public class Wrap {
    public static void main(String[] args) {
        Integer iOb = new Integer(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb);
    }
}
