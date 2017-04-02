package eu.bakhtin.corejava.abstractclasses;

/**
 * @version 1.0
 * @author Igor Bakhtin
 */
public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
