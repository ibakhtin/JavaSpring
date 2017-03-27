package javabyherbertschildt.chapter19.bitset;

// Demonstrate BitSet.

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSetA = new BitSet(16);
        BitSet bitSetB = new BitSet(16);

        // set some bits
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bitSetA.set(i);
            if ((i % 5) != 0) bitSetB.set(i);
        }

        System.out.println("Initial patterns in bitSetA: ");
        System.out.println(bitSetA);
        System.out.println();
        System.out.println("Initial patterns in bitSetB: ");
        System.out.println(bitSetB);
        System.out.println();

        // AND bits
        bitSetA.and(bitSetB);
        System.out.println("bitSetA AND bitSetB");
        System.out.println(bitSetA);

        // OR bits
        bitSetA.or(bitSetB);
        System.out.println("bitSetA OR bitSetB");
        System.out.println(bitSetA);

        // XOR bits
        bitSetA.xor(bitSetB);
        System.out.println("bitSetA XOR bitSetB");
        System.out.println(bitSetA);
    }
}
