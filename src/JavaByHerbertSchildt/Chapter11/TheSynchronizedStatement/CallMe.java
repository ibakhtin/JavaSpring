package JavaByHerbertSchildt.Chapter11.TheSynchronizedStatement;

/**
 * Created by ibakhtin on 11.03.17.
 */

class CallMe {

    void call (String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("interrupted");
        }

        System.out.println("]");
    }
}
