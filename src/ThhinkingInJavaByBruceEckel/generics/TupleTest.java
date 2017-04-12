package ThhinkingInJavaByBruceEckel.generics;

import eu.bakhtin.util.FiveTuple;
import eu.bakhtin.util.FourTuple;
import eu.bakhtin.util.ThreeTuple;
import eu.bakhtin.util.TwoTuple;

/**
 * Created by ibakhtin on 11.04.17.
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 12.345);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}


class Vehicle {
    @Override
    public String toString() {
        return "Vehicle{}";
    }
}

class Amphibian {
    @Override
    public String toString() {
        return "Amphibian{}";
    }
}