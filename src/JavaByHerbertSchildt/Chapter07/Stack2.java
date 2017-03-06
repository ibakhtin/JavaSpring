package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Stack implementation.

class Stack2 {
    private int[] stack;
    private int tos;

    Stack2(int size) {
        stack = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (tos == stack.length)
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
