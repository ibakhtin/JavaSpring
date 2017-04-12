package ThhinkingInJavaByBruceEckel.generics;

import eu.bakhtin.util.FourTuple;
import eu.bakhtin.util.Tuple;

import java.util.ArrayList;

/**
 * @author ibakhtin
 */
public class TupleList<A, B, C, D>
        extends ArrayList<FourTuple<A, B, C, D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> tupleList = new TupleList<>();

        tupleList.add(TupleTest.h());
        tupleList.add(TupleTest.h());

        for (FourTuple<Vehicle, Amphibian, String, Integer> fourTuple : tupleList)
            System.out.println(fourTuple);
    }
}
