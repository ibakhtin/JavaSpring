package javabyherbertschildt.chapter20.bytearrayinputstream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

    public static void main(String[] args) {
        String string = "abcdef";
        byte[] bytes = string.getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);

        for (int i = 0; i < 2; i++) {
            int c;
            while ((c = inputStream.read()) != -1) {
                if (i == 0) System.out.print((char) c);
                else System.out.print(Character.toUpperCase((char) c));
            }
            System.out.println();
            inputStream.reset();
        }
    }
}
