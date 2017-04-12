package eu.bakhtin.util;

/**
 * @author ibakhtin
 */
public class FiveTuple<A, B, C, D, E> {
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;
    public final E fifth;

    public FiveTuple(A first, B second, C third, D fourth, E fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    @Override
    public String toString() {
        return "(" +
                first +
                ", " + second +
                ", " + third +
                ", " + fourth +
                ", " + fifth +
                ")";
    }
}
