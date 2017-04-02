package javabyherbertschildt.chapter20.serialization;

import java.io.*;

/**
 * @author Igor Bakhtin
 */
public class SerializationDemo {
    public static void main(String[] args) {

        // Object serialization.

        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream("serial.dat"))) {

            SomeClass outputObject = new SomeClass("abc", 1.44, 128);

            System.out.println("outputObject: " + outputObject);

            outputStream.writeObject(outputObject);
        }
        catch (IOException e) {
            System.out.println("IOException during serialization.");
        }

        // Object deserialization.

        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream("serial.dat"))) {

            SomeClass inputObject = (SomeClass) inputStream.readObject();

            System.out.println("inputObject: " + inputObject);
        }
        catch (IOException e) {
            System.out.println("IOException during deserialization");
        }
        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException during deserialization");
        }
    }
}

// Class for serialization.

class SomeClass implements Serializable {

    String s;
    double d;
    int i;

    public SomeClass(String s, double d, int i) {
        this.s = s;
        this.d = d;
        this.i = i;
    }

    @Override
    public String toString() {
        return "s = " + s + ", d = " + d + ", i = " + i;
    }
}