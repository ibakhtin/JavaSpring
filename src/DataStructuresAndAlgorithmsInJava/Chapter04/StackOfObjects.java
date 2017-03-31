package DataStructuresAndAlgorithmsInJava.Chapter04;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * @author Igor Bakhtin
 * @since 30.03.17
 */
public class StackOfObjects<T> {
    private Vector<T> vector = new Vector<>();

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack.
     * @return the <code>item</code> argument.
     */
    public T push(T item) {
        vector.addElement(item);

        return item;
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return the object at the top of this stack
     * @throws EmptyStackException if this stack is empty.
     */
    public T peek() {
        int length = vector.size();

        if (length == 0)
            throw new EmptyStackException();

        return vector.elementAt(length - 1);
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The object at the top of this stack.
     * @throws EmptyStackException if this stack is empty.
     */
    public T pop() {
        T item;

        item = peek();

        vector.removeElementAt(vector.size() - 1);

        return item;
    }
}