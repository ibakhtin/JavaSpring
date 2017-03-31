package DataStructuresAndAlgorithmsInJava.Chapter04;

// Reverse string.

public class Reverser {
    private String inputString;
    private String outputString = "";

    public Reverser(String inputString) {
        this.inputString = inputString;
    }

    public String apply() {
        int stackSize = inputString.length();
        StackOfChars theStack = new StackOfChars(stackSize);

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            theStack.push(ch);
        }

        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            outputString += ch;
        }

        return outputString;
    }
    public String apply(String inputString) {
        StackOfChars theStack = new StackOfChars(inputString.length());

        inputString.chars().forEach(ch -> theStack.push((char) ch));

        while (!theStack.isEmpty()) outputString += theStack.pop();

        return outputString;
    }
}
