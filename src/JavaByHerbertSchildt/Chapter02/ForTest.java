package JavaByHerbertSchildt.Chapter02;

/**
 * Created by ibakhtin on 28.02.17.
 */

/*
*   Demonstrate the for loop.
* */

public class ForTest {
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 10; x = x + 1) {
            System.out.println("This is x: " + x);
        }
    }
}
