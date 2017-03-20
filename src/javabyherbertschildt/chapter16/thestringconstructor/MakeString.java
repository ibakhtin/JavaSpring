package javabyherbertschildt.chapter16.thestringconstructor;

/**
 * Created by ibakhtin on 19.03.17.
 */
public class MakeString {
    public static void main(String[] args) {
        char[] chars = { 'J', 'a', 'v', 'a' };

        String stringA = new String(chars);
        String stringB = new String(stringA);

        System.out.println(stringA);
        System.out.println(stringB);
    }
}
