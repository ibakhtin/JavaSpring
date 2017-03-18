package javabyherbertschildt.chapter15.lambdaexpressionsandexceptions;

/**
 * Created by ibakhtin on 18.03.17.
 */

// An example of capturing a local variable from the enclosing scope.

interface MyFunction {
    int function(int n);
}

public class VariableCapture {
    public static void main(String[] args) {

        // A local variable that can be captured.
        int num = 1000;

        MyFunction lambda = n -> {
            int v = n + num;

            // However, the following is illegal because
            // it attempts to modify the value of num.
            // num++;

            return v;
        };

        // The following line would also cause an error, because
        // it would remove the effectively final status from num.
        // num = 9;
    }
}