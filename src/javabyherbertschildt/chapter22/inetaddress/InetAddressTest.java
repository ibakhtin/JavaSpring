package javabyherbertschildt.chapter22.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Igor Bakhtin
 */
public class InetAddressTest
{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.bakhtin.eu");
        System.out.println(address);

        InetAddress[] SW = InetAddress.getAllByName("www.nba.com");
        for (InetAddress a : SW)
            System.out.println(a.getHostName());
    }
}
