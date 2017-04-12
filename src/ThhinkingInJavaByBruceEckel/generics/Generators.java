package ThhinkingInJavaByBruceEckel.generics;

import ThhinkingInJavaByBruceEckel.generics.coffee.Coffee;
import ThhinkingInJavaByBruceEckel.generics.coffee.CoffeeGenerator;
import eu.bakhtin.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Igor Bakhtin
 */
public class Generators
{
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n)
    {
        for (int i = 0; i < n; i++)
            collection.add(generator.next());

        return collection;
    }

    public static void main(String[] args)
    {
        Collection<Coffee> coffeeCollection =
                fill(new ArrayList<Coffee>(), new CoffeeGenerator(8), 8);

        for (Coffee coffee : coffeeCollection)
            System.out.println(coffee);

        Collection<Integer> fibbonacciCollection =
                fill(new ArrayList<Integer>(), new Fibonacci(), 8);

        for (int i : fibbonacciCollection)
            System.out.print(i + ", ");

        System.out.println();
    }
}
