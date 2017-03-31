package javabyherbertschildt.chapter20.dataiostreams;

import java.io.*;

/**
 * @author Igor Bakhtin
 */
public class DataIOStreamsDemo {

    public static void main(String[] args) {

        try (DataOutputStream dataOutputStream =
                     new DataOutputStream(new FileOutputStream("test.dat"))) {

            dataOutputStream.writeDouble(98.6);
            dataOutputStream.writeInt(1000);
            dataOutputStream.writeBoolean(true);
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        catch (IOException e) {
            System.out.println("IOException");
        }

        try (DataInputStream dataInputStream =
                     new DataInputStream(new FileInputStream("test.dat"))) {

            double d = dataInputStream.readDouble();
            int i = dataInputStream.readInt();
            boolean b = dataInputStream.readBoolean();

            System.out.println("Here are the values: " + d + ", " + i + ", " + b);
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
