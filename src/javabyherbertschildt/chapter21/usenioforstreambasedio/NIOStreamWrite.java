package javabyherbertschildt.chapter21.usenioforstreambasedio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.stream.IntStream;

/**
 * @author Igar Bakhtin
 */
public class NIOStreamWrite
{
    public static void main(String[] args)
    {
        try (OutputStream outputStream = Files.newOutputStream(Paths.get("test.txt")))
        {
            for (int i = 0; i < 26; i++)
                outputStream.write((byte) ('A' + i));
        }
        catch (InvalidPathException e)
        {
            System.out.println("Path Error " + e);
        }
        catch (IOException e)
        {
            System.out.println("I/O Error " + e);
        }
    }
}
