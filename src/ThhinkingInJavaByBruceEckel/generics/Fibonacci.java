package ThhinkingInJavaByBruceEckel.generics;

import eu.bakhtin.util.Generator;

/**
 * Created by ibakhtin on 10.04.17.
 */
public class Fibonacci implements Generator<Integer>
{
    private int count = 0;

    @Override
    public Integer next()
    {
        return fib(count++);
    }

    private int fib(int n)
    {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args)
    {
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i < 40; i++)
            System.out.print(fibonacci.next() + " ");
    }
}
