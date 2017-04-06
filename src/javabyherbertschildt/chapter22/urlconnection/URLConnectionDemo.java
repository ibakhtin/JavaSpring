package javabyherbertschildt.chapter22.urlconnection;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @author Igor Bakhtin
 */
public class URLConnectionDemo
{
    public static void main(String[] args) throws Exception
    {
        int c;
        URL url = new URL("http://www.internic.net");
        URLConnection urlConnection = url.openConnection();

        // Get date.
        long date = urlConnection.getDate();
        if (date == 0)
            System.out.println("No date information.");
        else
            System.out.println("Date: " + new Date(date));

        // Get content type.
        System.out.println("Content type: " + urlConnection.getContentType());

        // Get expiration date.
        date = urlConnection.getExpiration();
        if (date == 0)
            System.out.println("No expiration information.");
        else
            System.out.println("Expiration: " + date);

        // Get last-modified date.
        date = urlConnection.getLastModified();
        if (date == 0)
            System.out.println("No last-modified information.");
        else
            System.out.println("Last-Modified: " + date);

        // Get content length.
        long contentLength = urlConnection.getContentLengthLong();
        if (contentLength == -1)
            System.out.println("Content length is not available.");
        else
            System.out.println("Content length: " + contentLength);

        if (contentLength != 0)
        {
            try ( InputStream inputStream = urlConnection.getInputStream() )
            {
                while ((c = inputStream.read()) != -1)
                    System.out.print((char) c);
            }
        }
        else
            System.out.println("No content available.");
    }
}
