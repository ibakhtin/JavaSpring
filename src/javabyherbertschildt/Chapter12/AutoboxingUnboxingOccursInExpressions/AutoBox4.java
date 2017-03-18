package javabyherbertschildt.Chapter12.AutoboxingUnboxingOccursInExpressions;

/**
 * Created by ibakhtin on 12.03.17.
 */

public class AutoBox4 {
    public static void main(String[] args) {

        Integer integerObj = 100;
        Double doubleObj = 98.6;

        doubleObj = doubleObj + integerObj;
        System.out.println("doubleObj after exptession: "
                + doubleObj);
    }
}
