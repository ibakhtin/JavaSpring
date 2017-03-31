package DataStructuresAndAlgorithmsInJava.Chapter04;

// Simple stack implementation.

public class StackOfChars {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackOfChars(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char element) {
        stackArray[++top] = element;
    }

    public char pop() {
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
