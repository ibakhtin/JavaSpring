package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// TestStack class.

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 stackA = new Stack2(5);
        Stack2 stackB = new Stack2(8);

        // push some numbers onto the stack
        for (int i = 0; i < 5; i++) stackA.push(i);
        for (int i = 0; i < 8; i++) stackB.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in stackA:");
        for (int i = 0; i < 5; i++)
            System.out.println(stackA.pop());

        System.out.println("Stack in stackB:");
        for (int i = 0; i < 8; i++)
            System.out.println(stackB.pop());
    }
}
