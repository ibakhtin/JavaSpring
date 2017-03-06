package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Stack implementation.

class Stack {
    private int[] stack = new int[10];
    private int tos;

    // Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            stack[++tos] = item;
    }

    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stack[tos--];
    }
}
