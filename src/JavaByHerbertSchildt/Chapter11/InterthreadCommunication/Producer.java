package JavaByHerbertSchildt.Chapter11.InterthreadCommunication;

/**
 * Created by ibakhtin on 11.03.17.
 */

// Producer class.

class Producer implements Runnable {

    Queue queue;

    Producer(Queue queue) {
        this.queue = queue;
        new Thread(this, "Producer").start();
    }

    public void run() {

        int i = 0;

        while(true) {
            this.queue.put(i++);
        }
    }
}
