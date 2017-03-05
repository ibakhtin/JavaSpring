package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 05.03.17.
 */

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peller {
    static Apple peel(Apple apple) {
        // ... remove peel
        apple.isPeeled = true;
        return apple;
    }
}

class Apple {
    boolean isPeeled = false;
    Apple getPeeled() {
        return Peller.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
