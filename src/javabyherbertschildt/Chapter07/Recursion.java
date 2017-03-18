package javabyherbertschildt.Chapter07;

/**
 * Created by ibakhtin on 06.03.17.
 */

class Factorial {
    int factorial(int n) {
        int result;

        if (n == 1) return 1;
        result = factorial(n - 1) * n;
        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial of 3 is " + f.factorial(3));
        System.out.println("Factorial of 4 is " + f.factorial(4));
        System.out.println("Factorial of 5 is " + f.factorial(5));
    }
}
