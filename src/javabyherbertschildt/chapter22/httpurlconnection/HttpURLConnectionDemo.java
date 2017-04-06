package javabyherbertschildt.chapter22.httpurlconnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Igor Bakhtin
 */
public class HttpURLConnectionDemo
{
    public static void main(String[] args)
    {
        try
        {
            URL url = new URL("https://ya.ru/");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            // Display request method.
            System.out.println("Request method is: " + httpURLConnection.getRequestMethod());

            // Display response code.
            System.out.println("Response code is: " + httpURLConnection.getResponseCode());

            // Display response message.
            System.out.println("Response message is: " + httpURLConnection.getResponseMessage());

            // Get a list of the header fields and a set of the header keys.
            Map<String, List<String>> headerMap = httpURLConnection.getHeaderFields();
            Set<String> headerField = headerMap.keySet();

            System.out.println("\nHere is the header:");

            for (String key : headerField)
                System.out.println("Key: " + key + ", Value: " + headerMap.get(key));
        }
        catch (MalformedURLException e)
        {
            System.out.println("MalformedURLException " + e);
        }
        catch (IOException e)
        {
            System.out.println("IOException " + e);
        }
    }
}
