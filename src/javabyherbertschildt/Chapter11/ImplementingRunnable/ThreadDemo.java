package javabyherbertschildt.Chapter11.ImplementingRunnable;

/**
 * Created by ibakhtin on 10.03.17.
 */

// Create a second thread.

class NewThread implements Runnable {
    Thread thread;

    NewThread() {
        thread = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + thread);
        thread.start();
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

public class ThreadDemo {
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
