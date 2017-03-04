package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 03.03.17.
 */

// Exercise 6

class Dog2 {
    void bark(int i, boolean b) {
        System.out.println("Arf, arf.");
    }

    void bark(boolean b, int i) {
        System.out.println("Bow, bow.");
    }
}

public class Exercise06 {
    public static void main(String[] args) {
        Dog2 smallDog = new Dog2();
        Dog2 bigDog = new Dog2();

        smallDog.bark(1, true);
        bigDog.bark(true, 1);
    }
}
