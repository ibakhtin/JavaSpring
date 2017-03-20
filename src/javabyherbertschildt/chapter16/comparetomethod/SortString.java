package javabyherbertschildt.chapter16.comparetomethod;

/**
 * Created by ibakhtin on 19.03.17.
 */

// A bubble sort for Strings.

public class SortString {
    static String[] strings = {
            "Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };

    public static void main(String[] args) {
        for(int j = 0; j < strings.length; j++) {
            for(int i = j + 1; i < strings.length; i++) {
                if(strings[i].compareTo(strings[j]) < 0) {
                    String t = strings[j];
                    strings[j] = strings[i];
                    strings[i] = t;
                }
            }
            System.out.println(strings[j]);
        }
    }
}
