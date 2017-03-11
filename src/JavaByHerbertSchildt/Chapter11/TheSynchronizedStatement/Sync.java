package JavaByHerbertSchildt.Chapter11.TheSynchronizedStatement;

/**
 * Created by ibakhtin on 11.03.17.
 */

public class Sync {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller callerA = new Caller(target, "Hello");
        Caller callerB = new Caller(target, "Synchronized");
        Caller callerC = new Caller(target, "World");

        try {
            callerA.thread.join();
            callerB.thread.join();
            callerC.thread.join();
        }
        catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}
