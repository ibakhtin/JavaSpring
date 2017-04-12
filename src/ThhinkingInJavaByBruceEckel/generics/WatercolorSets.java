package ThhinkingInJavaByBruceEckel.generics;

import ThhinkingInJavaByBruceEckel.generics.watercolors.Watercolors;

import java.util.EnumSet;
import java.util.Set;

import static ThhinkingInJavaByBruceEckel.generics.watercolors.Watercolors.*;
import static eu.bakhtin.util.Sets.*;
/**
 * @author ibakhtin
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> setA = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> setB = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);

        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n%n", setB);
        System.out.printf("union(setA, setB) = %s%n", union(setA, setB));
        Set<Watercolors> subSet = intersection(setA, setB);
        System.out.printf("intersection(setA, setB) = %s%n", subSet);
        System.out.printf("difference(setA, subSet) = %s%n", difference(setA, subSet));
        System.out.printf("difference(setB, subSet) = %s%n", difference(setB, subSet));
        System.out.printf("complement(setA, setB) = %s%n", complement(setA, setB));
    }
}
