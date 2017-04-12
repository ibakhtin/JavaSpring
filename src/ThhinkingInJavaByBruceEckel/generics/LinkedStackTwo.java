package ThhinkingInJavaByBruceEckel.generics;

/**
 * @author Igor Bakhtin, igor@bakhtin.eu
 */
public class LinkedStackTwo<T>
{
    private class Node
    {
        T item;
        Node next;

        Node()
        {
            this.item = null;
            this.next = null;
        }

        Node(T item, Node next)
        {
            this.item = item;
            this.next = next;
        }

        boolean end()
        {
            return item == null && next == null;
        }
    }

    private Node top = new Node();

    public void push(T item)
    {
        top = new Node(item, top);
    }

    public T pop()
    {
        T result = top.item;

        if (!top.end()) top = top.next;
        return result;
    }

    public static void main(String[] args)
    {
        LinkedStackTwo<String> stringLinkedStack = new LinkedStackTwo<>();

        for (String s : "Phasers on stun!".split(" "))
            stringLinkedStack.push(s);

        String s;

        while ((s = stringLinkedStack.pop()) != null)
            System.out.println(s);
    }
}
