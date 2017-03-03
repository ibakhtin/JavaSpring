/**
 * Created by ibakhtin on 03.03.17.
 */



class Dog {
    void bark(int i) {
        System.out.println("Arf, arf.");
    }

    void bark(double d) {
        System.out.println("Bow, bow.");
    }
}

public class Exercise05 {
    public static void main(String[] args) {
        Dog smallDog = new Dog();
        Dog bigDog = new Dog();
        
        smallDog.bark(1);
        bigDog.bark(1.0);
    }
}
