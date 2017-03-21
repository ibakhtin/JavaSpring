package javabyherbertschildt.chapter17.memorymanagement;

/**
 * Created by ibakhtin on 21.03.17.
 */

public class MemoryDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long memA, memB;
        Integer integers[] = new Integer[1000];

        System.out.println("Total memory is: " + runtime.totalMemory());

        memA = runtime.freeMemory();
        System.out.println("Initial free memory: " + memA);

        runtime.gc();

        memA = runtime.freeMemory();
        System.out.println("Free memory after garbage collection: " + memA);

        for (int i = 0; i < 1000; i++) {
            integers[i] = new Integer(i);
        }

        memB = runtime.freeMemory();

        System.out.println("Free memory after allocation: " + memA);
        System.out.println("Memory used by allocation: " + (memA - memB));

        // discard Integers
        for(int i=0; i<1000; i++) integers[i] = null;

        runtime.gc(); // request garbage collection

        memB = runtime.freeMemory();

        System.out.println("Free memory after collecting" +
                " discarded Integers: " + memB);
    }
}
