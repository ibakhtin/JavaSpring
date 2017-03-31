package javabyherbertschildt.chapter20.file;

// Demonstrate File class.

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");

        System.out.printf("File name: %s%n", file.getName());
        System.out.printf("Path: %s%n", file.getPath());
        System.out.printf("Absolute path: %s%n", file.getAbsolutePath());
        System.out.printf("Parent: %s%n", file.getParent());
        System.out.printf("%s%n", file.canWrite() ? "is writable" : "is not writable");
        System.out.printf("%s%n", file.canRead() ? "is readable" : "is not readable");
        System.out.printf("%s%n", file.isDirectory() ? "is a directory" : "is not a directory");
        System.out.printf("%s%n", file.isFile() ? "is normal file" : "might be named file");
        System.out.printf("%s%n", file.isAbsolute() ? "is absolute" : "is not absolute");
        System.out.printf("File last modified: %tc%n", file.lastModified());
        System.out.printf("File size (bytes): %s%n ", file.length());
    }
}
