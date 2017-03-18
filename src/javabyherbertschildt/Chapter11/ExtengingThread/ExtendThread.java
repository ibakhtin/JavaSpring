package javabyherbertschildt.Chapter11.ExtengingThread;

/**
 * Created by ibakhtin on 10.03.17.
 */

// Create a second thread by extending Thread.

class NewThread extends Thread {

    NewThread() {
        // create a new, second thread.
        super("Child Thread");
        System.out.println("Child thread: " + this);
        start();
    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Main Thread interrupted.");
        }
        System.out.println("Exiting main thread.");
    }
}
