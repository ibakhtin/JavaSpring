package ThhinkingInJavaByBruceEckel.generics;

import eu.bakhtin.util.Generator;

import java.util.*;

/**
 * @author ibakhtin
 */
public class BankTeller {
    public static void serve(Teller teller, Customer customer) {
        System.out.printf("%s serves %s%n", teller, customer);
    }

    public static void main(String[] args) {
        Random random = new Random(47);

        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line, Customer.generator(), 15);

        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers, Teller.generator(), 4);

        for (Customer customer : line)
            serve(tellers.get(random.nextInt(tellers.size())), customer);
    }
}

class Customer {
    private static long counter = 0;
    private final long id = ++counter;

    private Customer() {}

    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator() {
        return Customer::new;
    }
}

class Teller {
    private static long counter = 0;
    private final long id = ++counter;

    private Teller() {}

    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator() {
        return Teller::new;
    }
}
