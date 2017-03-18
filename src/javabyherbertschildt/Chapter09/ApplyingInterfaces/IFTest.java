package javabyherbertschildt.Chapter09.ApplyingInterfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

public class IFTest {
    public static void main(String[] args) {
        FixedStack stackA = new FixedStack(5);
        FixedStack stackB = new FixedStack(8);

        for (int i = 0; i < 5; i++) stackA.push(i);
        for (int i = 0; i < 8; i++) stackB.push(i);

        System.out.println("Stack in stackA: ");
        for (int i = 0; i < 5; i++)
            System.out.println(stackA.pop());

        System.out.println("Stack in stackB: ");
        for (int i = 0; i < 8; i++)
            System.out.println(stackB.pop());
    }
}
