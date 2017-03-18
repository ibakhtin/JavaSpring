package javabyherbertschildt.chapter15.passinglambdaexpressionsasarguments;

/**
 * Created by ibakhtin on 18.03.17.
 */

@interface Main {}

interface StringFunction {
    String function(String s);
}

public class LambdaArgumentsDemo {

    static String stringOp(StringFunction stringFunction, String s) {
        return stringFunction.function(s);
    }

    @Main
    public static void main(String[] args) {
        String inString = "Lambdas add power to Java";
        String outString;

        System.out.println("Here is input string: " + inString);

        outString = stringOp((s) -> s.toUpperCase(), inString);
        System.out.println("The string in uppercase: " + outString);

        outString = stringOp((s) -> {
            String result = "";

            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) != ' ')
                    result += s.charAt(i);

            return result;
        }, inString);
        System.out.println("The string with removed spaces: " + outString);

        StringFunction reverse = s -> {
            String result = "";

            for (int i = s.length() - 1; i >= 0; i--)
                result += s.charAt(i);

            return result;
        };
        System.out.println("The string reversed: " + stringOp(reverse, inString));
    }
}
