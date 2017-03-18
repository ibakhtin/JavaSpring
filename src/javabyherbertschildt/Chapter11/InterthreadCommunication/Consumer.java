package javabyherbertschildt.Chapter11.InterthreadCommunication;

/**
 * Created by ibakhtin on 11.03.17.
 */

// Consumer class.

public class Consumer implements Runnable {

    Queue queue;

    Consumer(Queue queue) {
        this.queue = queue;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            this.queue.get();
        }
    }
}
