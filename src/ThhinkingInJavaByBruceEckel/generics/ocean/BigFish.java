package ThhinkingInJavaByBruceEckel.generics.ocean;

import eu.bakhtin.util.BasicGenerator;
import eu.bakhtin.util.Generator;

/**
 * @author ibakhtin
 */
public class BigFish {
    private static long counter = 0;
    private final long id = ++counter;

    private BigFish() {}

    // lambda implementation
    public static Generator<BigFish> generator() {
        return BigFish::new;
    }
    // end of lambda implementation

//    // anonymous class implementation
//    public static Generator<BigFish> generator() {
//        return new Generator<BigFish>() {
//            public BigFish next() {
//                return new BigFish();
//            }
//        };
//    }
//    // end of anonymous class implementation

//    // inner class implementation
//    public static Generator<BigFish> generator() {
//        class BigFishGenerator implements Generator<BigFish> {
//            public BigFish next() {
//                return new BigFish();
//            }
//        }
//
//        return new BigFishGenerator();
//    }
//    // end of inner class implementation

    @Override
    public String toString() {
        return "BigFish " + id;
    }
}
