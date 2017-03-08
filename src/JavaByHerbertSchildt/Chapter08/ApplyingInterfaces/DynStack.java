package JavaByHerbertSchildt.Chapter08.ApplyingInterfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Implements a "growable" stack.

public class DynStack implements IntStack {
    private int[] stack;
    private int tos;

    // Allocate and initialize stack
    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    public void push(int item) {
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2];

            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }

            stack = temp;
            stack[++tos] = item;
        } else
            stack[++tos] = item;
    }

    // Pop an item from the stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stack[tos--];
    }
}
