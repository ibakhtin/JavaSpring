package javabyherbertschildt.Chapter09.Interfaces;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Client class implements Callback interface.

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
}
