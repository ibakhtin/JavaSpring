package ThhinkingInJavaByBruceEckel.generics;

/**
 * @author ibakhtin
 */
public class Manipulation {
    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator2<HasF> manipulator2 = new Manipulator2<>(hasF);
        manipulator2.manipulate();
    }
}
