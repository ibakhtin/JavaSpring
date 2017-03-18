package javabyherbertschildt.Chapter11.UsingIsAliveAndJoin;

/**
 * Created by ibakhtin on 10.03.17.
 */

// Demonstrate using isAlive() and join()

public class Demo {
    public static void main(String[] args) {
        NewThread threadA = new NewThread("A");
        NewThread threadB = new NewThread("B");
        NewThread threadC = new NewThread("C");

        System.out.println("Thread A is alive: "
                + threadA.thread.isAlive());
        System.out.println("Thread B is alive: "
                + threadB.thread.isAlive());
        System.out.println("Thread C is alive: "
                + threadC.thread.isAlive());

        try {
            threadA.thread.join();
            threadB.thread.join();
            threadC.thread.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Thread A is alive: "
                + threadA.thread.isAlive());
        System.out.println("Thread B is alive: "
                + threadB.thread.isAlive());
        System.out.println("Thread C is alive: "
                + threadC.thread.isAlive());

        System.out.println("Main thread exiting.");
    }
}
