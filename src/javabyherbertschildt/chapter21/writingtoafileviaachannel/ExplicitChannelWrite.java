package javabyherbertschildt.chapter21.writingtoafileviaachannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Igor Bakhtin
 */
public class ExplicitChannelWrite {
    public static void main(String[] args) {

        // Obtain a channel to a file within a try-with-resources block.
        try (FileChannel byteChannel =
                (FileChannel) Files.newByteChannel(Paths.get("text.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE)) {

            // Create a buffer.
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);

            // Write some bytes to the buffer.
            for (int i = 0; i < 26; i++)
                byteBuffer.put((byte) ('A' + i));

            // Reset the buffer so that it can be written.
            byteBuffer.rewind();

            // Write the buffer to the output file.
            byteChannel.write(byteBuffer);
        }
        catch (InvalidPathException e) {
            System.out.println("InvalidPathException" + e);
        }
        catch (IOException e) {
            System.out.println("IOException" + e);
        }
    }
}
