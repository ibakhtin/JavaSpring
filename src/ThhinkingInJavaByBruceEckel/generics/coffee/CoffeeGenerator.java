package ThhinkingInJavaByBruceEckel.generics.coffee;

import eu.bakhtin.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Igor Bakhtin
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>
{
    private Class[] types = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private static Random random = new Random(47);
    private int size = 0;

    public CoffeeGenerator() {}

    public CoffeeGenerator(int size)
    {
        this.size = size;
    }

    public Coffee next()
    {
        try
        {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee>
    {
        int count = size;

        @Override
        public boolean hasNext()
        {
            return count > 0;
        }

        @Override
        public Coffee next()
        {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator()
    {
        return new CoffeeIterator();
    }

    public static void main(String[] args)
    {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();

        for (int i = 0; i < 50; i++)
            System.out.print(coffeeGenerator.next() + " ");

        System.out.println();

        for (Coffee coffee : new CoffeeGenerator(5))
            System.out.println(coffee);
    }
}
