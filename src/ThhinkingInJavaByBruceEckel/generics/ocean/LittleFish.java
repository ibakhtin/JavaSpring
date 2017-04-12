package ThhinkingInJavaByBruceEckel.generics.ocean;

import eu.bakhtin.util.Generator;

/**
 * @author ibakhtin
 */
public class LittleFish {
    private static long counter = 0;
    private final long id = ++counter;

    private LittleFish() {}

//    // constructor reference implementation
//    public final static Generator<LittleFish> generator = LittleFish::new;

//    // anonymous class implementation
//    public final static Generator<LittleFish> generator =
//            new Generator<LittleFish>() {
//                public LittleFish next() {
//                    return new LittleFish();
//                }
//            };

    // inner class implementation
    public final static Generator<LittleFish> generator = new LittleFishGenerator();
    private static class LittleFishGenerator implements Generator<LittleFish> {
        public LittleFish next() {
            return new LittleFish();
        }
    }

    @Override
    public String toString() {
        return "LittleFish " + id;
    }

}
