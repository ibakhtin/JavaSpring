package JavaByHerbertSchildt.Chapter06;

/**
 * Created by ibakhtin on 06.03.17.
 */

// A program that uses the Box class.

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume is " + vol);
    }
}
