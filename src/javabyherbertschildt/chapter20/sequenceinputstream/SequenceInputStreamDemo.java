package javabyherbertschildt.chapter20.sequenceinputstream;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        }
        catch (IOException e) {
            return null;
        }
    }
}

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement("fileA.txt");
        files.addElement("fileB.txt");
        files.addElement("fileC.txt");

        InputStreamEnumerator inputStreamEnumerator = new InputStreamEnumerator(files);

        try (InputStream inputStream = new SequenceInputStream(inputStreamEnumerator)) {
            while ((c = inputStream.read()) != -1)
                System.out.print((char) c);
        }
        catch(NullPointerException e) {
            System.out.println("Error Opening File.");
        }
        catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
