package JavaByHerbertSchildt.Chapter09.ApplyingInterfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */
public class IFTest2 {
    public static void main(String[] args) {
        DynStack stackA = new DynStack(5);
        DynStack stackB = new DynStack(8);

        for (int i = 0; i < 12; i++) stackA.push(i);
        for (int i = 0; i < 20; i++) stackB.push(i);

        System.out.println("Stack in stackA: ");
        for (int i = 0; i < 12; i++)
            System.out.println(stackA.pop());

        System.out.println("Stack in stackB: ");
        for (int i = 0; i < 20; i++)
            System.out.println(stackB.pop());
    }
}
