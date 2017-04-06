package javabyherbertschildt.chapter22.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Igor Bakhtin
 */
public class URLTest
{
    public static void main(String[] args) throws MalformedURLException
    {
        URL url = new URL("http://HerbShieldt.com/Articles/");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Port: " + url.getPort());
        System.out.println("Host: " + url.getHost());
        System.out.println("File: " + url.getFile());
        System.out.println("Ext: " + url.toExternalForm());
    }
}
