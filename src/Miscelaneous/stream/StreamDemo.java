package Miscelaneous.stream;


import java.util.ArrayList;
import java.util.List;

class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Sex gender;

    public Person(String firstName, String lastName, int age, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Sex getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{ " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                " }";
    }
}

enum Sex {
    MALE,
    FEMALE
}

public class StreamDemo {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Doe", 50, Sex.MALE));
        people.add(new Person("Elvis", "Presley", 30, Sex.MALE));
        people.add(new Person("John", "Lennon", 20, Sex.MALE));
        people.add(new Person("Diana", "Krall", 45, Sex.FEMALE));
        people.add(new Person("Xenia", "Pokrovskaya", 30, Sex.FEMALE));

        people.forEach(System.out::println);

        System.out.println();

        people.stream()
                .filter(e -> e.getGender() == Sex.FEMALE)
                .forEach(System.out::println);

        System.out.println();

        double averageAgeOfJohns = people.stream()
                .filter(e -> e.getGender() == Sex.FEMALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println(averageAgeOfJohns);
    }
}
