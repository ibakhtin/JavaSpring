package JavaByHerbertSchildt.Chapter08.ApplyingInterfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Create an interface variable and
// access stack through it.

public class IFTest3 {
    public static void main(String[] args) {
        IntStack intStack;
        DynStack dynStack = new DynStack(5);
        FixedStack fixedStack = new FixedStack(8);

        intStack = dynStack;
        for (int i = 0; i < 12; i++) intStack.push(i);

        intStack = fixedStack;
        for (int i = 0; i < 8; i++) intStack.push(i);

        intStack = dynStack;
        System.out.println("Stack in dynamic stack: ");
        for (int i = 0; i < 12; i++)
            System.out.println(intStack.pop());

        intStack = fixedStack;
        System.out.println("Stack in fixed stack: ");
        for (int i = 0; i < 8; i++)
            System.out.println(intStack.pop());
    }
}
