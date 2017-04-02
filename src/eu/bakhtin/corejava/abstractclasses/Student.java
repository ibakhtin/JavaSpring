package eu.bakhtin.corejava.abstractclasses;

/**
 * @version 1.0
 * @author Igor Bakhtin
 */
public class Student extends Person {

    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
