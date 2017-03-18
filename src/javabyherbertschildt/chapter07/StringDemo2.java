package javabyherbertschildt.chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

// Demonstrating some String methods.

class StringDemo2 {
    public static void main(String args[]) {
        String stringA = "First String";
        String stringB = "Second String";
        String stringC = stringA;

        System.out.println("Length of stringA: " +
                stringA.length());

        System.out.println("Char at index 3 in stringA: " +
                stringA.charAt(3));

        if(stringA.equals(stringB))
            System.out.println("stringA == stringB");
        else
            System.out.println("stringA != stringB");

        if(stringA.equals(stringC))
            System.out.println("stringA == stringC");
        else
            System.out.println("stringA != stringC");
    }
}