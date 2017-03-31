package javabyherbertschildt.chapter20.bytearrayoutputstream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String string = "This should end up in the array";
        byte[] buffer = string.getBytes();

        try {
            outputStream.write(buffer);
        }
        catch (IOException e) {
            System.out.println("Error Writing Buffer.");
        }

        System.out.println("Buffer as a string");
        System.out.println(outputStream.toString());
        System.out.println("Into Array");

        byte[] bytes = outputStream.toByteArray();

        for (byte item : bytes) System.out.print((char) item);

        System.out.println();

        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {
            outputStream.writeTo(fileOutputStream);
        }
        catch (IOException e) {
            System.out.println("I/O Error " + e);
            return;
        }

        System.out.println("Doing a Reset");
        outputStream.reset();

        for (int i = 0; i < 3; i++) {
            outputStream.write('X');
        }

        System.out.println(outputStream.toString());
    }
}
