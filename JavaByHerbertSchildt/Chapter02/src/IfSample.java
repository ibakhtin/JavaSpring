/**
 * Created by ibakhtin on 28.02.17.
 */

/*
*   Demonstrate the if.
*   Call this file "IfSample.java"
* */

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 100;
        y = 200;

        if(x < y) System.out.println("x is less than y");

        x = x * 2;

        if(x == y) System.out.println("x now equal to y");

        x = x * 2;

        if(x > y) System.out.println("x now greater than y");

        // this won't display anything
        if(x == y) System.out.println("you won't see this");
    }
}
