package ThhinkingInJavaByBruceEckel.generics;

import eu.bakhtin.util.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author ibakhtin
 */
public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
    private Office office = new Office();

    public Store(int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; i++)
            add(new Aisle(nShelves, nProducts));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Aisle aisle : this)
            for (Shelf shelf : aisle)
                for (Product product : shelf) {
                    result.append(product);
                    result.append("\n");
                }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 5, 10));
    }
}

class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;

        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: $" + price;
    }

    public void priceChange(double change) {
        price += change;
    }

//    public static Generator<Product> generator =
//            new Generator<Product>() {
//                Random random = new Random(47);
//                @Override
//                public Product next() {
//                    return new Product(random.nextInt(),
//                            "Test",
//                            Math.round(random.nextDouble() * 1000) + 0.99);
//                }
//            };

    private static Random random = new Random(47);

    public static Generator<Product> generator = () ->
        new Product(random.nextInt(1000), "Test",
                Math.round(random.nextDouble() * 100) * 10 - 0.01);
}

class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }
}

class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves, int nProducts) {
        for (int i = 0; i < nShelves; i++)
            add(new Shelf(nProducts));
    }
}

class CheckoutStand {}
class Office {}

