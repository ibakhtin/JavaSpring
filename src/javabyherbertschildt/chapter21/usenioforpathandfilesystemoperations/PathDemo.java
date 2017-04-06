package javabyherbertschildt.chapter21.usenioforpathandfilesystemoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Igor Bakhtin
 */
public class PathDemo
{
    public static void main(String[] args)
    {
        Path filePath = Paths.get("test.txt");

        System.out.println("File Name: " + filePath.getName(0) );
        System.out.println("Path: " + filePath);
        System.out.println("Absolute Path: " + filePath.toAbsolutePath());
        System.out.println("Parent: " + filePath.getParent());

        if (Files.exists(filePath))
            System.out.println("File exists");
        else
            System.out.println("File does not exist");

        try
        {
            if (Files.isHidden(filePath))
                System.out.println("File is hidden");
            else
                System.out.println("File is not hidden");
        }
        catch (IOException e)
        {
            System.out.println("I/O Error: " + e);
        }

        if (Files.isWritable(filePath))
            System.out.println("File is writable");

        if (Files.isReadable(filePath))
            System.out.println("File is readable");

        try
        {
            BasicFileAttributes fileAttributes =
                    Files.readAttributes(filePath, BasicFileAttributes.class);

            if (fileAttributes.isDirectory())
                System.out.println("The file is a directory");
            else
                System.out.println("The file is not a directory");

            if (fileAttributes.isRegularFile())
                System.out.println("The file is a normal file");
            else
                System.out.println("The file is not a normal file");

            if (fileAttributes.isSymbolicLink())
                System.out.println("The file is a symbolic link");
            else
                System.out.println("The file is not a symbolic link");

            System.out.println("File last modified: " + fileAttributes.lastModifiedTime());
            System.out.println("File size: " + fileAttributes.size() + " Bytes");
        }
        catch (IOException e)
        {
            System.out.println("Error reading attributes: " + e);
        }
    }
}
