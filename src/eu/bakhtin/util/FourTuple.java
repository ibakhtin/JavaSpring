package eu.bakhtin.util;

/**
 * @author ibakhtin
 */
public class FourTuple<A, B, C, D> {

    public final A first;
    public final B second;
    public final C third;
    public final D fourth;

    public FourTuple(A first, B second, C third, D fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "(" +
                first +
                ", " + second +
                ", " + third +
                ", " + fourth +
                ")";
    }

}
