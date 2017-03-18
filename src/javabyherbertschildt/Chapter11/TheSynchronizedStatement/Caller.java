package javabyherbertschildt.Chapter11.TheSynchronizedStatement;

/**
 * Created by ibakhtin on 11.03.17.
 */

class Caller implements Runnable {

    private String message;
    private CallMe target;
    Thread thread;

    Caller(CallMe target, String message) {
        this.target = target;
        this.message = message;
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Override
    public void run() {
        synchronized (this.target) {
            this.target.call(this.message);
        }
    }
}
