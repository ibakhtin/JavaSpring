package DataStructuresAndAlgorithmsInJava.Chapter04;

/**
 * @author Igor Bakhtin
 */
public class StackOfObjectsDemo {
    public static void main(String[] args) {
        StackOfObjects<Integer> stackOfObjects = new StackOfObjects<>();

        stackOfObjects.push(5);
        stackOfObjects.push(10);
        stackOfObjects.push(1);

        System.out.println(stackOfObjects.pop() + ", " + stackOfObjects.pop());
    }
}
