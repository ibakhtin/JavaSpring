package javabyherbertschildt.chapter19.stringtokenizer;

// Demonstrate StringTokenizer.

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    static String in = "title=Java: The Complete Reference;" +
            "author=Schildt;" +
            "publisher=McGraw-Hill;" +
            "copyright=2014";

    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer(in, "=;");

        while (stringTokenizer.hasMoreTokens()) {
            String key = stringTokenizer.nextToken();
            String value = stringTokenizer.nextToken();
            System.out.println(key + " = " + value);
        }
    }
}
