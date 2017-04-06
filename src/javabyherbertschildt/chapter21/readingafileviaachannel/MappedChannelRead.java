package javabyherbertschildt.chapter21.readingafileviaachannel;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * @author Igor Bakhtin
 */
public class MappedChannelRead {
    public static void main(String[] args) {

        // Obtain a channel to a file within a try-with-resources block.
        try (FileChannel fileChannel =
                     (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {

            // Get the size of the file.
            long fileSize = fileChannel.size();

            // Now, map the file into a buffer.
            MappedByteBuffer mappedByteBuffer =
                    fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileSize);

            // Read and display bytes from buffer.
            for (int i = 0; i < fileSize; i++)
                System.out.print((char) mappedByteBuffer.get());

            System.out.println();
        }
        catch (InvalidPathException e) {
            System.out.println("InvalidPathException" + e);
        }
        catch (IOException e) {
            System.out.println("IOException" + e);
        }
    }
}
