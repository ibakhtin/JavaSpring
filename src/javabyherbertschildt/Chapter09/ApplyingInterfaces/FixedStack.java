package javabyherbertschildt.Chapter09.ApplyingInterfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

// An Implementation of IntStack that uses fixed storage.

public class FixedStack implements IntStack {
    private int[] stack;
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // Push an item onto the stack.
    public void push(int item) {
        if (tos == stack.length - 1)
            System.out.println("Stack is full.");
        else
            stack[++tos] = item;
    }

    // Pop an item from the stack.
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stack[tos--];
    }
}
