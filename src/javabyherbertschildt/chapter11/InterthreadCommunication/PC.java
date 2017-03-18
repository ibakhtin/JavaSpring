package javabyherbertschildt.chapter11.InterthreadCommunication;

/**
 * Created by ibakhtin on 11.03.17.
 */

// PC class.

public class PC {
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Producer(queue);
        new Consumer(queue);

        System.out.println("Press Control-C to stop.");
    }
}
