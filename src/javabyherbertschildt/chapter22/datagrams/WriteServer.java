package javabyherbertschildt.chapter22.datagrams;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Igor Bakhtin
 */
public class WriteServer
{
    public static int serverPort = 1998;
    public static int clientPort = 1999;
    public static int bufferSize = 1024;
    public static DatagramSocket datagramSocket;
    public static byte[] buffer = new byte[bufferSize];

    public static void TheServer() throws Exception
    {
        int position = 0;
        while (true)
        {
            int c = System.in.read();
            switch (c)
            {
                case -1:
                    System.out.println("Server Quits.");
                    datagramSocket.close();
                    return;
                case '\r':
                    break;
                case '\n':
                    datagramSocket.send(new DatagramPacket(buffer, position,
                            InetAddress.getLocalHost(), clientPort));
                    position = 0;
                    break;
                default:
                    buffer[position++] = (byte) c;
            }
        }
    }

    public static void TheClient() throws Exception
    {
        while (true)
        {
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        }
    }

    public static void main(String[] args) throws Exception
    {
        if (args.length == 1)
        {
            datagramSocket = new DatagramSocket(serverPort);
            TheServer();
        }
        else
        {
            datagramSocket = new DatagramSocket(clientPort);
            TheClient();
        }
    }
}
