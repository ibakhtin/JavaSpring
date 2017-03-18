package javabyherbertschildt.Chapter11.SuspendingResumingAndStoppingThreads;

/**
 * Created by ibakhtin on 11.03.17.
 */

public class SuspendResume {
    public static void main(String[] args) {
        NewThread newThreadOne = new NewThread("One");
        NewThread newThreadTwo = new NewThread("Two");

        try {
            Thread.sleep(1000);
            newThreadOne.mysuspend();
            System.out.println("Suspended thread One.");
            Thread.sleep(1000);
            newThreadOne.myresume();
            System.out.println("Resuming thread One.");

            newThreadTwo.mysuspend();
            System.out.println("Suspended thread Two.");
            Thread.sleep(1000);
            newThreadTwo.myresume();
            System.out.println("Resuming thread Two.");
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
