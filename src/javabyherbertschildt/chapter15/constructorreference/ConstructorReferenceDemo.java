package javabyherbertschildt.chapter15.constructorreference;

/**
 * Created by ibakhtin on 19.03.17.
 */

interface ConstructorReference {
    Box function(int value);
}

class Box {
    private int value;

    Box() { this.value = 0; }

    Box(int value) { this.value = value; }

    int getValue() {
        return value;
    }
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {

        ConstructorReference boxConstructor = Box::new;

        Box boxA = boxConstructor.function(1000);

        System.out.println("value in boxA is " + boxA.getValue());
    }
}
