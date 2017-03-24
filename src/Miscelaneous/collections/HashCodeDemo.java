package Miscelaneous.collections;

/**
 * Created by ibakhtin on 24.03.17.
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        Double doubleValueA = 100.0;
        Double doubleValueB = 100.0;
        Integer integerValue = 100;

        System.out.println(doubleValueA.hashCode());
        System.out.println(doubleValueB.hashCode());
        System.out.println(integerValue.hashCode());
    }
}
