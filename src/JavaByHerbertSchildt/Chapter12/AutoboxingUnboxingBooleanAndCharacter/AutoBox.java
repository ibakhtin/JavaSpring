package JavaByHerbertSchildt.Chapter12.AutoboxingUnboxingBooleanAndCharacter;

/**
 * Created by ibakhtin on 12.03.17.
 */

// Autoboxing/unboxing a Boolean and Character.

public class AutoBox {
    public static void main(String[] args) {

        Boolean b = true;

        if (b) System.out.println("b is " + b);

        Character charObject = 'x';
        char charPrimitive = charObject;

        System.out.println("charPrimitive is " + charPrimitive);
        System.out.println("charObject is " + charObject);
    }
}
