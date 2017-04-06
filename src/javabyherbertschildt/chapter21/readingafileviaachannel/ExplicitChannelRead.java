package javabyherbertschildt.chapter21.readingafileviaachannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * @author Igor Bakhtin
 */
public class ExplicitChannelRead {

    public static void main(String[] args) {
        int count;

        // Next, obtain a channel to that file within a try-with-resources block.
        try (SeekableByteChannel byteChannel = Files.newByteChannel(Paths.get("test.txt"))) {

            // Allocate a buffer.
            ByteBuffer byteBuffer = ByteBuffer.allocate(128);

            do {
                // Read a buffer.
                count = byteChannel.read(byteBuffer);

                if (count != -1) {

                    // Rewind the buffer so that it can be read.
                    byteBuffer.rewind();

                    // Read bytes from the buffer and show
                    // them on the screen as characters.
                    for (int i = 0; i < count; i++)
                        System.out.print((char) byteBuffer.get());
                }
                System.out.println();

            } while (count != -1);
        }
        catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        }
        catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
