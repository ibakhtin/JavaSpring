package JavaByHerbertSchildt.Chapter09.VariablesInInterfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

public class Test {
    public static void main(String[] args) {
        Question question = new Question();

        AskMe.answer(question.ask());
        AskMe.answer(question.ask());
        AskMe.answer(question.ask());
        AskMe.answer(question.ask());
    }
}
