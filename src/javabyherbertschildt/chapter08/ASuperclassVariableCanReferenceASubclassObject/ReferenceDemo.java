package javabyherbertschildt.chapter08.ASuperclassVariableCanReferenceASubclassObject;

/**
 * Created by ibakhtin on 07.03.17.
 */

// A Superclass Variable Can Reference a Subclass Object

public class ReferenceDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double volume;

        volume = weightBox.volume();
        System.out.println("Volume of weightBox is " + volume);
        System.out.println("Weight of weightBox is " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;

        volume = plainBox.volume();
        System.out.println("Volume of plainBox is " + volume);

        // The following statement is invalid because
        // plainBox does not define a weight member.
        // System.out.println("Weight of plainBox is " + plainBox.weight);
    }
}
