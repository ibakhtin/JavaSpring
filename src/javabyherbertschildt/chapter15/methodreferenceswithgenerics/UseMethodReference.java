package javabyherbertschildt.chapter15.methodreferenceswithgenerics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ibakhtin on 19.03.17.
 */

class Box {
    private int value;

    Box(int value) { this.value = value; }

    int get() { return this.value; }
}

public class UseMethodReference {

    static int compareBox(Box boxA, Box boxB) {
        return boxA.get() - boxB.get();
    }

    public static void main(String[] args) {
        ArrayList<Box> boxArrayList = new ArrayList<Box>();

        boxArrayList.add(new Box(1));
        boxArrayList.add(new Box(4));
        boxArrayList.add(new Box(2));
        boxArrayList.add(new Box(9));
        boxArrayList.add(new Box(3));
        boxArrayList.add(new Box(7));

        Box maxBoxValue = Collections.max(boxArrayList, UseMethodReference::compareBox);
        System.out.println("Max value is: " + maxBoxValue.get());
    }
}
