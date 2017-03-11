package JavaByHerbertSchildt.Chapter11.SuspendingResumingAndStoppingThreads;

/**
 * Created by ibakhtin on 11.03.17.
 */

class NewThread implements Runnable {

    private String name;
    private Thread thread;
    private boolean suspendFlag;

    NewThread(String name) {
        this.name = name;
        thread = new Thread(this, this.name);
        System.out.println("New thread: " + thread);
        suspendFlag = false;
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
