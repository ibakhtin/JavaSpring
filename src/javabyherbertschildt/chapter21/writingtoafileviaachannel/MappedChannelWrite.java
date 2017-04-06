package javabyherbertschildt.chapter21.writingtoafileviaachannel;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Igor Bakhtin
 */
public class MappedChannelWrite {
    public static void main(String[] args) {

        try (FileChannel fileChannel =
                     (FileChannel) Files.newByteChannel(Paths.get("text.txt"),
                             StandardOpenOption.READ,
                             StandardOpenOption.WRITE,
                             StandardOpenOption.CREATE))
        {
            MappedByteBuffer byteBuffer =
                    fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < 26; i++)
                byteBuffer.put((byte) ('A' + i));
        }
        catch (InvalidPathException e) {
            System.out.println("InvalidPathException" + e);
        }
        catch (IOException e) {
            System.out.println("IOException" + e);
        }
    }
}
