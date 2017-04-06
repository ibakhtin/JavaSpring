package javabyherbertschildt.chapter21.listthecontentsofadirectory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Igor Bakhtin
 */
public class DirectoryList
{
    public static void main(String[] args)
    {
        String directoryName = "/Users/ibakhtin";

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directoryName)))
        {
            System.out.println("Directory of " + directoryName);

            for (Path entry : directoryStream)
            {
                BasicFileAttributes fileAttributes =
                        Files.readAttributes(entry, BasicFileAttributes.class);

                if (fileAttributes.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("      ");

                System.out.println(entry.getName(2));
            }
        }
        catch (InvalidPathException e)
        {
            System.out.println("Path Error " + e);
        }
        catch (NotDirectoryException e)
        {
            System.out.println(directoryName + " is not a directory.");
        }
        catch (IOException e)
        {
            System.out.println("I/O Error: " + e);
        }
    }
}
