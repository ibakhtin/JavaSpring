package DataStructuresAndAlgorithmsInJava.Chapter04;

// Simple stack implementation.

public class StackOfLongs {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackOfLongs(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
