package javabyherbertschildt.Chapter08.UsingSuperToCallSuperclassConstructors;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Using super to Call Superclass Constructors

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight boxA = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight boxB = new BoxWeight(2, 3, 4, 0.075);
        BoxWeight boxC = new BoxWeight();
        BoxWeight cube = new BoxWeight(3, 2);
        BoxWeight clone = new BoxWeight(boxA);

        System.out.println("Volume of boxA is " + boxA.volume());
        System.out.println("Weight of boxA is " + boxA.weight);
        System.out.println();

        System.out.println("Volume of boxB is " + boxB.volume());
        System.out.println("Weight of boxB is " + boxB.weight);
        System.out.println();

        System.out.println("Volume of boxC is " + boxC.volume());
        System.out.println("Weight of boxC is " + boxC.weight);
        System.out.println();

        System.out.println("Volume of cube is " + cube.volume());
        System.out.println("Weight of cube is " + cube.weight);
        System.out.println();

        System.out.println("Volume of clone is " + clone.volume());
        System.out.println("Weight of clone is " + clone.weight);
        System.out.println();
    }
}
