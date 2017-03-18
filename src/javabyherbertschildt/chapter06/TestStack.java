package javabyherbertschildt.chapter06;

/**
 * Created by ibakhtin on 06.03.17.
 */

// TestStack class.

public class TestStack {
    public static void main(String[] args) {
        Stack stackA = new Stack();
        Stack stackB = new Stack();

        // push some numbers onto the stack
        for (int i = 0; i < 10; i++) stackA.push(i);
        for (int i = 10; i < 20; i++) stackB.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in stackA:");
        for (int i = 0; i < 10; i++)
            System.out.println(stackA.pop());

        System.out.println("Stack in stackB:");
        for (int i = 0; i < 10; i++)
            System.out.println(stackB.pop());
    }
}
