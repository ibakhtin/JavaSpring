package ThhinkingInJavaByBruceEckel.generics.ocean;

import eu.bakhtin.util.Generators;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author ibakhtin
 */
public class OceanDemo {
    public static void main(String[] args) {
        Random random = new Random(10);

        List<BigFish> bigFishList = new LinkedList<>();
        Generators.fill(bigFishList, BigFish.generator(), 4);

        List<LittleFish> littleFishList = new LinkedList<>();
        Generators.fill(littleFishList, LittleFish.generator, 8);

        for (LittleFish littleFish : littleFishList)
            Ocean.eat(bigFishList.get(random.nextInt(bigFishList.size())), littleFish);
    }
}
