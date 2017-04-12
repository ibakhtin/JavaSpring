package ThhinkingInJavaByBruceEckel.generics;

import eu.bakhtin.util.BasicGenerator;
import eu.bakhtin.util.Generator;

/**
 * @author ibakhtin
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CounterObject> generatorOne =
                BasicGenerator.create(CounterObject.class);

        for (int i = 0; i < 5; i++)
            System.out.println(generatorOne.next());

        Generator<CounterObject> generatorTwo =
                new BasicGenerator<CounterObject>(CounterObject.class);

        for (int i = 0; i < 5; i++)
            System.out.println(generatorTwo.next());
    }
}
