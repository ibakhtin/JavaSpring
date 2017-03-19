package javabyherbertschildt.chapter15.constructorreference;

/**
 * Created by ibakhtin on 19.03.17.
 */

// Implement a simple class factory using a constructor reference.

interface ContainersConstructor<R, T> {
    R function(T t);
}

class GenericContainer<T> {
    private T value;

    GenericContainer(T value) { this.value = value; }

    public T getValue() { return value; }
}

class StringContainer {
    private String value;

    StringContainer(String value) { this.value = value; }

    public String getValue() { return value; }
}

public class SimpleFactoryDemo {

    static <R, T> R containerFactory(ContainersConstructor<R, T> constructor, T value) {
        return constructor.function(value);
    }

    public static void main(String[] args) {

        ContainersConstructor<GenericContainer<Double>, Double> doubleContainersConstructor =
                GenericContainer<Double>::new;
        GenericContainer<Double> doubleGenericContainer =
                containerFactory(doubleContainersConstructor, 100.001);
        System.out.println("value of doubleGenericContainer is " + doubleGenericContainer.getValue());

        ContainersConstructor<StringContainer, String> stringContainersConstructor = StringContainer::new;
        StringContainer stringContainer = containerFactory(stringContainersConstructor, "Lambda");
        System.out.println("value of stringContainer is " + stringContainer.getValue());
    }
}
