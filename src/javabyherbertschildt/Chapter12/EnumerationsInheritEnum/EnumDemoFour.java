package javabyherbertschildt.Chapter12.EnumerationsInheritEnum;

/**
 * Created by ibakhtin on 12.03.17.
 */

public class EnumDemoFour {
    public static void main(String[] args) {
        Apple appleA, appleB, appleC;

        System.out.println("Here ara all apple constants"
                + "and their ordinal values:");
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        appleA = Apple.RedDel;
        appleB = Apple.GoldenDel;
        appleC = Apple.RedDel;

        System.out.println();

        if (appleA.compareTo(appleB) < 0)
            System.out.println(appleA + " comes before " + appleB);

        if (appleA.compareTo(appleB) > 0)
            System.out.println(appleB + " comes before " + appleA);

        if (appleA.compareTo(appleC) == 0)
            System.out.println(appleA + " equals " + appleC);

        System.out.println();

        if (appleA.equals(appleB))
            System.out.println("Error!");

        if (appleA.equals(appleC))
            System.out.println(appleA + " equals " + appleC);

        if (appleA == appleC)
            System.out.println(appleA + " == " + appleC);
    }
}
