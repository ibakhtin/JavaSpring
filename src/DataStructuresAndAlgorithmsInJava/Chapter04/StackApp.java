package DataStructuresAndAlgorithmsInJava.Chapter04;

//

public class StackApp {
    public static void main(String[] args) {
        StackOfLongs theStack = new StackOfLongs(10);
        long longValue = 0;

        while (!theStack.isFull())
            theStack.push(longValue += 100);

        while (!theStack.isEmpty())
            System.out.print(theStack.pop() + " ");

        System.out.println();
    }
}
