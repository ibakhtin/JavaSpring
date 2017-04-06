package javabyherbertschildt.chapter22.tcpipclientsockets;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Demonstrate Client Sockets
 * @author Igor Bakhtin
 */
public class WhoIs
{
    public static void main(String[] args) throws Exception
    {
        try ( Socket socket = new Socket("whois.internic.net", 43) )
        {
            // Obtain input and output stream.
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            // Construct a request string.
            String requestString = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
            // Convert to byte.
            byte[] requestBuffer = requestString.getBytes();

            // Send request.
            outputStream.write(requestBuffer);

            int c;
            while ((c = inputStream.read()) != -1)
                System.out.print((char) c);
        }
    }
}
