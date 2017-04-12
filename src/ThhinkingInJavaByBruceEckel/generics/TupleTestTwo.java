package ThhinkingInJavaByBruceEckel.generics;

import eu.bakhtin.util.FiveTuple;
import eu.bakhtin.util.FourTuple;
import eu.bakhtin.util.ThreeTuple;
import eu.bakhtin.util.TwoTuple;

import static eu.bakhtin.util.Tuple.tuple;

/**
 * @author ibakhtin
 */
public class TupleTestTwo {

    private static TwoTuple<String, Integer> twoTuple() {
        return tuple("hi", 9);
    }

    private static TwoTuple twoTupleTwo() {
        return tuple("hi", 9);
    }

    private static ThreeTuple<Amphibian, String, Integer> threeTuple() {
        return tuple(new Amphibian(), "hi", 9);
    }

    private static FourTuple<Vehicle,Amphibian,String,Integer> fourTuple() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 9);
    }

    private static FiveTuple<Vehicle, Amphibian, String, Integer, Double> fiveTuple() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 9, 1.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> stringIntegerTwoTuple = twoTuple();
        System.out.println(stringIntegerTwoTuple);
        System.out.println(twoTupleTwo());
        System.out.println(threeTuple());
        System.out.println(fourTuple());
        System.out.println(fiveTuple());
    }
}
