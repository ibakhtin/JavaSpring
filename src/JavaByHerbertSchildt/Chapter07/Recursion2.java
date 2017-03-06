package JavaByHerbertSchildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        RecTest obj = new RecTest(10);

        for (int i = 0; i < 10; i++) obj.values[i] = i;

        obj.printArray(10);
    }
}
