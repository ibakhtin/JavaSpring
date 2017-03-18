package javabyherbertschildt.Chapter11.InterthreadCommunication;

/**
 * Created by ibakhtin on 11.03.17.
 */

// Queue class.

class Queue {

    private int n;
    private boolean valueSet = false;

    synchronized int get() {

        while (!valueSet) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException caught.");
            }
        }

        valueSet = false;
        System.out.println("Got: " + this.n);
        notify();
        return this.n;
    }

    synchronized void put(int n) {

        while (valueSet) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException caught.");
            }
        }
        valueSet = true;
        this.n = n;
        System.out.println("Put: " + this.n);
        notify();
    }
}
