package javabyherbertschildt.Chapter11.CreatingMultipleThreads;

/**
 * Created by ibakhtin on 10.03.17.
 */

// The NewThread class

class NewThread implements Runnable {
    String thradeName;
    Thread thread;

    NewThread(String thradeName) {
        this.thradeName = thradeName;
        thread = new Thread(this, this.thradeName);
        System.out.println("New thread: " + thread);
        thread.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(this.thradeName + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(this.thradeName + " interrupted.");
        }
        System.out.println(this.thradeName + " exiting.");
    }
}
