package javabyherbertschildt.chapter15.methodreferencestoinstancemethods;

/**
 * Created by ibakhtin on 19.03.17.
 */

// Use an instance method reference with different objects.

// A functional interface that takes two reference arguments
// and returns a boolean result.
interface MyFunc<T> {
    boolean function(T v1, T v2);
}

// A class that stores the temperature high for a day.
class HighTemp {
    private int value;

    HighTemp(int value) {
        this.value = value;
    }

    // Return true if the invoking HighTemp object has the same
    // temperature as highTemp.
    boolean sameTemp(HighTemp highTemp) {
        return this.value == highTemp.value;
    }

    // Return true if the invoking HighTemp object has a temperature
    // that is less than highTemp.
    boolean lessThanTemp(HighTemp highTemp) {
        return this.value < highTemp.value;
    }
}

public class InstanceMethodWithObjectReferenceDemo {

    // A method that returns the number of occurrences
    // of an object for which some criteria, as specified by
    // the MyFunc parameter, is true.
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (f.function(vals[i], v)) count++;

        return count;
    }

    public static void main(String[] args) {
        int count;

        // Create an array of HighTemp objects.
        HighTemp[] weekDaysHighs = {
                new HighTemp(89),
                new HighTemp(82),
                new HighTemp(90),
                new HighTemp(89),
                new HighTemp(89),
                new HighTemp(91),
                new HighTemp(84),
                new HighTemp(83)
        };

        // Use counter() with arrays of the class HighTemp.
        // Notice that a reference to the instance method
        // sameTemp() is passed as the second argument.
        count = counter(weekDaysHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        // Now, create and use another array of HighTemp objects.
        HighTemp[] weekDaysHighsTwo = {
                new HighTemp(32),
                new HighTemp(12),
                new HighTemp(24),
                new HighTemp(19),
                new HighTemp(18),
                new HighTemp(12),
                new HighTemp(-1),
                new HighTemp(13)
        };

        count = counter(weekDaysHighsTwo, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count + " days had a high of 12");

        // Now, use lessThanTemp() to find days when temperature was less
        // than a specified value.
        count = counter(weekDaysHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDaysHighsTwo, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println(count + " days had a high of less than 19");
    }
}
