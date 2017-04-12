package eu.bakhtin.util;

import ThhinkingInJavaByBruceEckel.generics.Fibonacci;
import ThhinkingInJavaByBruceEckel.generics.coffee.Coffee;
import ThhinkingInJavaByBruceEckel.generics.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ibakhtin
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++)
            collection.add(generator.next());

        return collection;
    }
}
